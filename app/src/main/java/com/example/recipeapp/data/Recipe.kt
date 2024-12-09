package com.example.recipeapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipes")
data class Recipe(
    @PrimaryKey val id: String = "",
    val title: String = "",
    val ingredients: String = "",
    val instructions: String = "",
    val imageUrl: String = "", // or local filepath in app's private storage
    val rating: Float = 0.0f
)