package com.example.recipeapp.data

import android.content.res.Resources
import com.example.recipeapp.R

/* Returns initial list of recipes. */
fun recipeList(resources: Resources): List<Recipe> {
    return listOf(
        Recipe(
            id = "0",
            title = "Spaghetti (Example1)",
            ingredients = "Noodles, Meatballs, Marinara Sauce",
            instructions = "instructions example, etc",
            imageUrl = "",
            rating = 4.7f
        ),
        Recipe(
            id = "1",
            title = "Dumplings (Example2)",
            ingredients = "Dough, Filling",
            instructions = "instructions example, etc etc",
            imageUrl = "",
            rating = 5.0f
        ),
        Recipe(
            id = "2",
            title = "Ramen (Example3)",
            ingredients = "Noodles, Soy Sauce",
            instructions = "instructions example, etc etc etc",
            imageUrl = "",
            rating = 2.0f
        )
    )
}