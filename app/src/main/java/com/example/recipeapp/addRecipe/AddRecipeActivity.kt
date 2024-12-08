package com.example.recipeapp.addRecipe

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.R
import com.google.android.material.textfield.TextInputEditText

const val RECIPE_TITLE = "title"
const val RECIPE_INGREDIENTS = "ingredients"
const val RECIPE_INSTRUCTIONS = "instructions"
const val RECIPE_IMAGEURL = "imageurl"

class AddRecipeActivity : AppCompatActivity() {
    private lateinit var addRecipeTitle: TextInputEditText
    private lateinit var addRecipeIngredients: TextInputEditText
    private lateinit var addRecipeInstructions: TextInputEditText
    private lateinit var addRecipeImageUrl: TextInputEditText

    // for adding gallery selection
    /*lateinit var binding: ActivityMainBinding
    val galleryLauncher = registerForActivityResult(ActivityResultContracts.GetContent()) {
        val galleryUri = it
        try{
            binding.image.setImageURI(galleryUri)
        }catch(e:Exception){
            e.printStackTrace()
        }

    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_recipe_layout)

        val selectImageIntent = registerForActivityResult(ActivityResultContracts.GetContent())
        { uri ->
            addRecipeImageUrl.setText(uri.toString())
        }
        findViewById<Button>(R.id.open_gallery_button).setOnClickListener {
            selectImageIntent.launch("image/*")
        }

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addRecipe()
        }
        addRecipeTitle = findViewById(R.id.add_recipe_title)
        addRecipeIngredients = findViewById(R.id.add_recipe_ingredients)
        addRecipeInstructions = findViewById(R.id.add_recipe_instructions)
        addRecipeImageUrl = findViewById(R.id.add_recipe_imageUrl)


    }

    /* The onClick action for the done button. Closes the activity and returns the new recipe name
    and description as part of the intent. If the name or description are missing, the result is set
    to cancelled. */

    private fun addRecipe() {
        val resultIntent = Intent()

        if (addRecipeTitle.text.isNullOrEmpty() || addRecipeIngredients.text.isNullOrEmpty() || addRecipeInstructions.text.isNullOrEmpty() || addRecipeImageUrl.text.isNullOrEmpty()) {
            setResult(Activity.RESULT_CANCELED, resultIntent)
        } else {
            val title = addRecipeTitle.text.toString()
            val ingredients = addRecipeIngredients.text.toString()
            val instructions = addRecipeInstructions.text.toString()
            val imageUrl = addRecipeImageUrl.text.toString()
            resultIntent.putExtra(RECIPE_TITLE, title)
            resultIntent.putExtra(RECIPE_INGREDIENTS, ingredients)
            resultIntent.putExtra(RECIPE_INSTRUCTIONS, instructions)
            resultIntent.putExtra(RECIPE_IMAGEURL, imageUrl)
            setResult(Activity.RESULT_OK, resultIntent)
        }
        finish()
    }
}