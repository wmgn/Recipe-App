package com.example.recipeapp.recipeDetail

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.R
import com.example.recipeapp.recipeList.RECIPE_ID
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.BufferedInputStream
import java.io.IOException
import java.net.URL

class RecipeDetailActivity : AppCompatActivity() {

    private val recipeDetailViewModel by viewModels<RecipeDetailViewModel> {
        RecipeDetailViewModelFactory(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_detail_activity)

        var currentRecipeId: String? = null

        /* Connect variables to UI elements. */
        val recipeTitle: TextView = findViewById(R.id.recipe_detail_title)
        val recipeImageView: ImageView = findViewById(R.id.recipe_detail_image)
        val recipeIngredients: TextView = findViewById(R.id.recipe_detail_ingredients)
        val recipeInstructions: TextView = findViewById(R.id.recipe_detail_instructions)
        val recipeRating: TextView = findViewById(R.id.recipe_detail_rating)
        val recipeRatingBar: RatingBar = findViewById(R.id.recipe_rating_bar)
        val removeRecipeButton: Button = findViewById(R.id.remove_button)


        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            currentRecipeId = bundle.getString(RECIPE_ID)
        }

        /* If currentRecipeId is not null, get corresponding recipe and set name, image and
        description */
        currentRecipeId?.let {
            val currentRecipe = recipeDetailViewModel.fetchRecipeById(it)

            recipeDetailViewModel.recipe.observe(this) { currentRecipe ->
                if (currentRecipe != null) {
                    if (currentRecipe.imageUrl != null) {
                        val imageUrl = currentRecipe.imageUrl
                        if (imageUrl.startsWith("http")) {
                            // Handle remote image URL
                            CoroutineScope(Dispatchers.Main).launch {
                                val bm = com.example.recipeapp.recipeList.getImageBitmap(imageUrl)
                                if (bm != null) {
                                    recipeImageView.setImageBitmap(bm)
                                } else {
                                    recipeImageView.setImageResource(R.drawable.ic_launcher_background)
                                }
                            }
                        } else if (imageUrl.startsWith("content")) {
                            // Handle local content URI
                            val uri = Uri.parse(imageUrl)
                            recipeImageView.setImageURI(uri)
                        } else {
                            recipeImageView.setImageResource(R.drawable.ic_launcher_background)
                        }
                    } else {
                        recipeImageView.setImageResource(R.drawable.ic_launcher_background)
                    }

                    recipeTitle.text = currentRecipe.title
                    recipeIngredients.text = currentRecipe.ingredients
                    recipeInstructions.text = currentRecipe.instructions
                    recipeRating.text = "Rating: " + currentRecipe.rating.toString()
                    recipeRatingBar.rating = currentRecipe.rating

                    // remove button
                    removeRecipeButton.setOnClickListener {
                        recipeDetailViewModel.removeRecipe(currentRecipe)
                        finish()
                    }
                }
            }

        }

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