package com.example.recipeapp

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Favorites: AppCompatActivity() {
     fun onCreate() {
        enableEdgeToEdge()
         setContentView(R.layout.favorite_recipes)

     }
}