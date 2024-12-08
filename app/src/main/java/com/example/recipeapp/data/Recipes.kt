package com.example.recipeapp.data

import android.content.res.Resources

/* Returns initial list of recipes. */
fun recipeList(resources: Resources): List<Recipe> {
    return listOf(
        Recipe(
            id = "0",
            title = "Spaghetti (Example1)",
            ingredients = "Noodles, Meatballs, Marinara Sauce, 1 pound ground beef · 1 medium onion, chopped · 4 cloves garlic, minced · 1 small green bell pepper, diced",
            instructions = "instructions example1, etc\n1. do -- etc\n2. do etc...\n3.Done",
            imageUrl = "https://media.istockphoto.com/id/1144823591/photo/spaghetti-in-a-dish-on-a-white-background.jpg?s=612x612&w=0&k=20&c=SeEWmJfPQlX1zVUHPKjL-cgYeMs9cZ97-kdZMm7feA4=",
            rating = 4.7f
        ),
        Recipe(
            id = "1",
            title = "Dumplings (Example2)",
            ingredients = "Dough, Filling, 1 cup all-purpose flour · 2 teaspoons baking powder · 1 teaspoon white sugar · ½ teaspoon salt · 1 tablespoon butter or margarine",
            instructions = "instructions example2, \n1.etc 2.\netc",
            imageUrl = "https://media.istockphoto.com/id/1133151212/photo/japanese-dumplings-gyoza-with-pork-meat-and-vegetables.jpg?s=612x612&w=0&k=20&c=vC6GTUDGK6dD5_QHvY1V7fVUdPx-z4TG73DUACR_L5s=",
            rating = 5.0f
        ),
        Recipe(
            id = "2",
            title = "Ramen (Example3)",
            ingredients = "Noodles, Soy Sauce, 1 tablespoon sesame oil · 3 teaspoons grated ginger · 4 teaspoons grated garlic · 4 cups broth",
            instructions = "instructions example3, \nStep 1.etc \nStep 2.etc \nStep 3.etc",
            imageUrl = "https://media.istockphoto.com/id/607992438/photo/asian-noodles-with-beef-and-egg.jpg?s=612x612&w=0&k=20&c=k1yvKL16t_-KH5QFO8bE40tMJIkKGXxbhbCrpusje-4=",
            rating = 2.1f
        )
    )
}