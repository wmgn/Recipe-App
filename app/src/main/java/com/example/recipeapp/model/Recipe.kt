package com.example.recipeapp.model

data class Recipe(
    val id: String = "",
    val title: String = "",
    val ingredients: String = "",
    val instructions: String = "",
    val imageUrl: String = "",
    val rating: Float = 0.0f
)