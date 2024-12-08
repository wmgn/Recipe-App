package com.example.recipeapp.data

/* Returns initial list of recipes. */
fun recipeList(): List<Recipe> {
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
            ingredients = "1/2 medium head Napa cabbage (about 1 pound)\n" +
                    "1 tablespoon kosher salt\n" +
                    "1 pound ground pork\n" +
                    "1 bunch scallions, thinly sliced (about 1 cup)\n" +
                    "1 bunch cilantro, minced (about 3/4 cup)\n" +
                    "3 tablespoons soy sauce\n" +
                    "2-inch piece fresh ginger, grated on a microplane or finely minced (about 3 tablespoons)\n" +
                    "2 tablespoons sesame oil\n" +
                    "2 large eggs, whisked\n" +
                    "1 (12-ounce) package round dumpling, wonton, or gyoza wrappers\n",
            instructions = "In a large heavy bottomed pot like a dutch oven, melt butter over medium-high heat. Add onion, carrots, and celery. Cook for 5 minutes, until vegetables being to soften. Add garlic and cook for 1 minute more.\n" +
                    "Add flour and stir to combine. Cook for 1 minute, stirring constantly. Slowly add the evaporated milk and chicken stock, stirring to combine. You are making a roux to thicken the soup and make it creamy. It's very important to keep stirring to prevent burning or lumps!\n" +
                    "Bring to a boil and add the chicken, thyme, black pepper and salt. Lower the heat and let the soup simmer, uncovered, while you make the dumplings. \n" +
                    "Dumplings\n" +
                    "In a medium sized bowl, whisk to combine the flour, baking powder, pepper, salt and thyme. Make a well in the center of the flour mixture and pour the milk and butter into the center of it. \n" +
                    "Using a wooden spoon (or rubber spatula), stir together until a dough ball forms. If your dough seems too dry, you can add an extra tablespoon of milk. \n" +
                    "Using a medium sized cookie scoop, scoop dough and drop directly into the simmering soup. Place them around the pot, not all in the same place. Once all dumplings have been added, gently press them down so the soup runs over just the tops of them. You can also use two spoons to scoop the dumplings, using one spoon to scoop and the other to push the dough into the pot. Try to keep the dough balls the same size for even cooking.\n" +
                    "Place the lid on your pot and lower the heat to a low simmer. You don’t want the bottom of the soup to burn, but want the soup to still be simmering (a low bubble) to cook the dumplings. \n" +
                    "Cook dumplings for 15 minutes with the pot lid on. Gently stir the soup/dumplings and cut one dumpling in half to make sure they are cooked through. About half way through the cook time, I will usually open the lid once and press the dumplings back under the broth. I will also break up any dumplings that may be sticking together.\n" +
                    "If the dumplings are cooked through, serve hot! If not, cook an additional 3 to 4 minutes and check again. \n",
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