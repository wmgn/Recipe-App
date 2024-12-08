package com.example.recipeapp.recipeDetail

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.R
import com.example.recipeapp.recipeList.RECIPE_ID
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

        var currentRecipeId: Long? = null

        /* Connect variables to UI elements. */
        val recipeTitle: TextView = findViewById(R.id.recipe_detail_title)
        val recipeImageView: ImageView = findViewById(R.id.recipe_detail_image)
        val recipeIngredients: TextView = findViewById(R.id.recipe_detail_ingredients)
        val recipeInstructions: TextView = findViewById(R.id.recipe_detail_instructions)
        val recipeRating: TextView = findViewById(R.id.recipe_detail_rating)
        val removeRecipeButton: Button = findViewById(R.id.remove_button)


        val bundle: Bundle? = intent.extras
        if (bundle != null) {
            currentRecipeId = bundle.getLong(RECIPE_ID)
        }

        /* If currentRecipeId is not null, get corresponding recipe and set name, image and
        description */
        currentRecipeId?.let {
            val currentRecipe = recipeDetailViewModel.getRecipeForId(it)
            recipeTitle.text = currentRecipe?.title
            if (currentRecipe != null) {
                if (currentRecipe.imageUrl != null) {
                    val bm = getImageBitmap(currentRecipe.imageUrl)
                    if (bm != null){
                        recipeImageView.setImageBitmap(bm)
                    } else {
                        recipeImageView.setImageResource(R.drawable.ic_launcher_background)
                    }
                } else {
                    recipeImageView.setImageResource(R.drawable.ic_launcher_background)
                }
            }
            recipeIngredients.text = currentRecipe?.ingredients
            recipeInstructions.text = currentRecipe?.instructions
            recipeRating.text = currentRecipe?.rating.toString() // TODO rating change to not text ?

            removeRecipeButton.setOnClickListener {
                if (currentRecipe != null) {
                    recipeDetailViewModel.removeRecipe(currentRecipe)
                }
                finish()
            }
        }

    }
}


private fun getImageBitmap(url: String): Bitmap? {
    var bm: Bitmap? = null
    try {
        val aURL = URL(url)
        val conn = aURL.openConnection()
        conn.connect()
        val iS = conn.getInputStream()
        val biS = BufferedInputStream(iS)
        bm = BitmapFactory.decodeStream(biS)
        biS.close()
        iS.close()
    } catch (e: IOException) {
        //Log.w(TAG, "Error getting bitmap", e)
    }
    return bm
}