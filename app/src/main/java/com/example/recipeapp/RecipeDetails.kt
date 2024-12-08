package com.example.recipeapp

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

// currently not used

class RecipeDetails: AppCompatActivity() {
    fun onCreate() {
        enableEdgeToEdge()
        setContentView(R.layout.recipe_item)

    }
}