package com.example.recipeapp.recipeList

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.R
import com.example.recipeapp.data.Recipe
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.BufferedInputStream
import java.io.File
import java.io.IOException
import java.net.URL


class RecipesAdapter(private val onClick: (Recipe) -> Unit) :
    ListAdapter<Recipe, RecipesAdapter.RecipeViewHolder>(RecipeDiffCallback) {

    /* ViewHolder for Recipe, takes in the inflated view and the onClick behavior. */
    class RecipeViewHolder(itemView: View, val onClick: (Recipe) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        private val recipeTextView: TextView = itemView.findViewById(R.id.recipe_text)
        private val recipeImageView: ImageView = itemView.findViewById(R.id.recipe_image)
        private var currentRecipe: Recipe? = null

        init {
            itemView.setOnClickListener {
                currentRecipe?.let {
                    onClick(it)
                }
            }
        }

        /* Bind recipe name and image. */
        fun bind(recipe: Recipe) {
            currentRecipe = recipe

            recipeTextView.text = recipe.title
            if (recipe.imageUrl != null) {
                val imageUrl = recipe.imageUrl
                if (imageUrl.startsWith("http")) {
                    // Handle remote image URL
                    CoroutineScope(Dispatchers.Main).launch {
                        val bm = com.example.recipeapp.recipeList.getImageBitmap(imageUrl)
                        if (bm != null) {
                            recipeImageView.setImageBitmap(bm)
                        } else {
                            recipeImageView.setImageResource(R.drawable.image_missing_svgrepo_com)
                        }
                    }
                } else if (File(imageUrl).exists()) {
                    val bitmap = BitmapFactory.decodeFile(imageUrl)
                    recipeImageView.setImageBitmap(bitmap)
                } else {
                    recipeImageView.setImageResource(R.drawable.image_missing_svgrepo_com)
                }
            } else {
                recipeImageView.setImageResource(R.drawable.image_missing_svgrepo_com)
            }
        }
    }

    /* Creates and inflates view and return RecipeViewHolder. */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recipe_item, parent, false)
        return RecipeViewHolder(view, onClick)
    }

    /* Gets current recipe and uses it to bind view. */
    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = getItem(position)
        holder.bind(recipe)

    }
}

object RecipeDiffCallback : DiffUtil.ItemCallback<Recipe>() {
    override fun areItemsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Recipe, newItem: Recipe): Boolean {
        return oldItem.id == newItem.id
    }
}

// Function to fetch a bitmap from a URL
suspend fun getImageBitmap(url: String): Bitmap? {
    return withContext(Dispatchers.IO) {
        try {
            val aURL = URL(url)
            val conn = aURL.openConnection()
            conn.connect()
            val iS = conn.getInputStream()
            val biS = BufferedInputStream(iS)
            val bm = BitmapFactory.decodeStream(biS)
            biS.close()
            iS.close()
            bm
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }
}

