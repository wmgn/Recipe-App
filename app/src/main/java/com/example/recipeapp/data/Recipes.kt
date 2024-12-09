package com.example.recipeapp.data

/* Returns initial list of recipes. */
fun recipeList(): List<Recipe> {
    return listOf(
        Recipe(
            id = "0",
            title = "Spaghetti (Example 1)",
            ingredients = "Noodles, Meatballs, Marinara Sauce, 1 pound ground beef · 1 medium onion, chopped · 4 cloves garlic, minced · 1 small green bell pepper, diced",
            instructions = "instructions example1, etc\n1. do -- etc\n2. do etc...\n3.Done",
            imageUrl = "https://media.istockphoto.com/id/1144823591/photo/spaghetti-in-a-dish-on-a-white-background.jpg?s=612x612&w=0&k=20&c=SeEWmJfPQlX1zVUHPKjL-cgYeMs9cZ97-kdZMm7feA4=",
            rating = 4.7f
        ),
        Recipe(
            id = "1",
            title = "Dumplings (Example 2)",
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
            title = "Ramen (Example 3)",
            ingredients = "Noodles, Soy Sauce, 1 tablespoon sesame oil · 3 teaspoons grated ginger · 4 teaspoons grated garlic · 4 cups broth",
            instructions = "instructions example3, \nStep 1.etc \nStep 2.etc \nStep 3.etc",
            imageUrl = "https://media.istockphoto.com/id/607992438/photo/asian-noodles-with-beef-and-egg.jpg?s=612x612&w=0&k=20&c=k1yvKL16t_-KH5QFO8bE40tMJIkKGXxbhbCrpusje-4=",
            rating = 2.1f
        ),
        Recipe(
            id = "3",
            title = "Good Old-Fashioned Pancakes (Example 4)",
            ingredients = "1 ½ cups all-purpose flour\n" +
                    "\n" +
                    "3 ½ teaspoons baking powder\n" +
                    "\n" +
                    "1 tablespoon white sugar\n" +
                    "\n" +
                    "¼ teaspoon salt, or more to taste\n" +
                    "\n" +
                    "1 ¼ cups milk\n" +
                    "\n" +
                    "3 tablespoons butter, melted\n" +
                    "\n" +
                    "1 large egg\n" +
                    "\n",
            instructions = "Step 1\nSift flour, baking powder, sugar, and salt together in a large bowl. Make a well in the center and add milk, melted butter, and egg; mix until smooth.\n" +
                    "\n" +
                    "Step 2\nHeat a lightly oiled griddle or pan over medium-high heat. Pour or scoop the batter onto the griddle, using approximately 1/4 cup for each pancake; cook until bubbles form and the edges are dry, about 2 to 3 minutes. Flip and cook until browned on the other side. Repeat with remaining batter.\n" +
                    "\n",
            imageUrl = "https://www.allrecipes.com/thmb/SsL-e_0gTwoUa3ek_AVASUXritc=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/21014-Good-old-Fashioned-Pancakes-mfs_002-0e249c95678f446291ebc9408ae64c05.jpg",
            rating = 4.5f
        ),
        Recipe(
            id = "4",
            title = "Chicken Parmesan (Example 5)",
            ingredients = "4 skinless, boneless chicken breast halves\n" +
                    "\n" +
                    "salt and freshly ground black pepper to taste\n" +
                    "\n" +
                    "2 large eggs\n" +
                    "\n" +
                    "1 cup panko bread crumbs, or more as needed\n" +
                    "\n" +
                    "¾ cup grated Parmesan cheese, divided\n" +
                    "\n" +
                    "2 tablespoons all-purpose flour, or more if needed\n" +
                    "\n" +
                    "½ cup olive oil for frying, or as needed\n" +
                    "\n" +
                    "½ cup prepared tomato sauce\n" +
                    "\n" +
                    "¼ cup fresh mozzarella, cut into small cubes\n" +
                    "\n" +
                    "¼ cup chopped fresh basil\n" +
                    "\n" +
                    "½ cup grated provolone cheese\n" +
                    "\n" +
                    "2 teaspoons olive oil\n" +
                    "\n",
            instructions = "1. Gather the ingredients. Preheat an oven to 450 degrees F (230 degrees C).\n" +
                    "\n2. Place chicken breasts between two sheets of heavy plastic (resealable freezer bags work well) on a solid, level surface. Firmly pound chicken with the smooth side of a meat mallet to a thickness of 1/2-inch.\n" +
                    "\n3. Season chicken thoroughly with salt and pepper. Using a sifter or strainer; sprinkle flour over chicken breasts, evenly coating both sides\n" +
                    "\n4. Beat eggs in a shallow bowl and set aside. Mix bread crumbs and 1/2 cup Parmesan cheese in a separate bowl, set aside. Dip a flour-coated chicken breast in beaten eggs. Transfer breast to the bread crumb mixture, pressing crumbs into both sides. Repeat for each breast. Let chicken rest for 10 to 15 minutes.\n" +
                    "\n5. Heat 1/2 inch olive oil in a large skillet on medium-high heat until it begins to shimmer. Cook chicken in the hot oil until golden, about 2 minutes per side. The chicken will finish cooking in the oven.\n" +
                    "\n6. Transfer chicken to a baking dish. Top each breast with 2 tablespoons tomato sauce. Layer each chicken breast with equal amounts of mozzarella cheese, fresh basil, and provolone cheese. Sprinkle remaining Parmesan over top and drizzle each with 1/2 teaspoon olive oil.\n" +
                    "\n7. Bake in the preheated oven until cheese is browned and bubbly and chicken breasts are no longer pink in the center, 15 to 20 minutes. An instant-read thermometer inserted into the center should read at least 165 degrees F (74 degrees C).\n" +
                    "\n",
            imageUrl = "https://www.allrecipes.com/thmb/0NW5WeQpXaotyZHJnK1e1mFWcCk=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/223042-Chicken-Parmesan-mfs_001-7ab952346edc4b2da36f3c0259b78543.jpg",
            rating = 4.3f
        ),
        Recipe(
            id = "5",
            title = "Blueberry Muffins (Example 6)",
            ingredients = "2 1/2 cups plus 2 tablespoons all-purpose flour (see Cook's Note)\n" +
                    "\n" +
                    "\n" +
                    "1 tablespoon baking powder  \n" +
                    "\n" +
                    "\n" +
                    "2 cups fresh blueberries  \n" +
                    "\n" +
                    "\n" +
                    "1 cup buttermilk \n" +
                    "\n" +
                    "\n" +
                    "1/4 cup sour cream \n" +
                    "\n" +
                    "\n" +
                    "2 teaspoons pure vanilla extract \n" +
                    "\n" +
                    "\n" +
                    "2 teaspoons kosher salt \n" +
                    "\n" +
                    "\n" +
                    "Nonstick cooking spray \n" +
                    "\n" +
                    "\n" +
                    "10 tablespoons unsalted butter, at room temperature  \n" +
                    "\n" +
                    "\n" +
                    "1 1/4 cup granulated sugar  \n" +
                    "\n" +
                    "\n" +
                    "1 teaspoon finely grated lemon zest \n" +
                    "\n" +
                    "\n" +
                    "1 large egg \n" +
                    "\n" +
                    "\n" +
                    "2 large egg yolks \n" +
                    "\n" +
                    "\n" +
                    "3 tablespoons raw sugar  \n" +
                    "\n",
            instructions = "1. Whisk together 2 1/2 cups of the flour and the baking powder in a medium bowl until completely combined. Toss 1 1/2 cups of the blueberries with the remaining 2 tablespoons flour in a medium bowl until completely coated. Whisk together the buttermilk, sour cream, vanilla and salt in a large measuring cup until smooth.\n" +
                    "2. Arrange a rack in the center of the oven and preheat to 425 degrees F. Spray the top of a 12-cup muffin tin with nonstick spray and line with standard cupcake liners. (It's important to spray the top of the pan because the muffin tops will stick to the pan if you don't.)  \n" +
                    "3. Beat the butter, granulated sugar and lemon zest with an electric mixer on medium-high speed until light and fluffy, occasionally scraping down the sides and bottom of the bowl, 3 to 4 minutes. Add the egg and yolks and continue beating until fully incorporated, about 2 minutes.  \n" +
                    "4. With the mixer on low, add the dry ingredients in 3 additions, alternating with the wet ingredients in 2 additions, beginning and ending with the dry ingredients. Fold in the blueberries until evenly distributed (be careful not to overmix). \n" +
                    "5. Divide the batter evenly among the prepared muffin cups with a heaping 1/3 cup per muffin. Top the batter with the remaining 1/2 cup blueberries, gently pressing to adhere (you should have 4 to 5 berries per muffin). Sprinkle with the raw sugar.  \n" +
                    "6. Bake the muffins, rotating the pan halfway through, until a tester inserted into the center comes out clean, 25 to 30 minutes. Transfer the pan to a wire rack and let the muffins cool in the pan for 5 minutes. Then remove the muffins onto the wire rack to cool completely.  \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/9/0/FNK_the-best-blueberry-muffins_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1568040661674.webp",
            rating = 1.9f
        ),
        Recipe(
            id = "6",
            title = "Creme Brulee (Example 7)",
            ingredients = "2 1/2 cups heavy cream\n" +
                    "\n" +
                    "\n" +
                    "1 vanilla bean, split lengthwise  \n" +
                    "\n" +
                    "\n" +
                    "1/4 teaspoon kosher salt \n" +
                    "\n" +
                    "\n" +
                    "12 tablespoons sugar \n" +
                    "\n" +
                    "\n" +
                    "7 large egg yolks  ",
            instructions = "1. Arrange a rack in the center of the oven and preheat to 300 degrees F. Line a large heavy roasting pan (a turkey roasting pan works great) with a clean kitchen towel and place 4 six-ounce ramekins on top of the towel spaced a few inches apart.\n" +
                    "2. Heat the cream in a medium saucepan over medium heat. Using the back of a paring knife, scrape the vanilla seeds from both halves of the pod. Add the seeds and pod to the cream. Whisk in the salt and 3 tablespoons of the sugar and bring to a boil. Remove from the heat.  \n" +
                    "3. Vigorously whisk the yolks and 3 more tablespoons of the sugar in a large bowl until pale yellow and very thick and creamy, about 2 minutes. Alternatively, you can use an electric mixer on high speed and beat until pale yellow and very thick and creamy, about 1 minute.  \n" +
                    "4. Whisking the yolks constantly, add a couple of teaspoons at a time from 1 cup of the hot cream, then increase to a steady stream until the cream is fully incorporated. (Don't pour too much hot cream at once or you'll end up with scrambled eggs.) The yolks are now tempered. Whisk the tempered yolks back into the remaining hot cream until combined. Strain through a fine mesh sieve into a large measuring cup or medium pitcher for easier pouring; discard the vanilla pods. \n" +
                    "5. Skim the foam off the top of the custard by placing a clean paper towel on top and lightly pressing down so it touches the surface and absorbs some of the liquid. This will make for a completely smooth and silky custard. Fill the ramekins with the custard, about 3/4 cup per ramekin.  \n" +
                    "6. Carefully pour boiling water into the roasting pan halfway up the sides of the ramekins without getting any water in the custard. Cover the pan tightly with foil and bake until the custard is set around the edges but still has a slight jiggle in the center, 35 to 45 minutes. Carefully remove the roasting pan from the oven and transfer the ramekins to a wire rack to cool for 30 minutes. Then refrigerate until very cold, about 3 hours.  \n" +
                    "7. Just before serving, evenly spread 1 tablespoon of the sugar over the top of a custard. Hold a kitchen torch 2 inches above the surface. Starting in the center of the ramekin, move the flame in a circular motion and work your way out to the edges to caramelize the sugar. Repeat with the remaining sugar and custards.  \n" +
                    "8. Alternatively, arrange a rack in the top position of the oven and heat the broiler on high. Place the ramekins on a rack set inside a baking sheet and broil until deep golden brown, 15 to 60 seconds, checking every 10 seconds.  \n" +
                    "9. Freeze the custards for 5 minutes before serving (see Cook’s Note).  \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/3/0/FNK_the-best-creme-brulee_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1567523601035.webp",
            rating = 0.5f
        ),
        Recipe(
            id = "7",
            title = "Chicken Tikka Masala (Example 8)",
            ingredients = "1 1/4 cup whole milk yogurt\n" +
                    "\n" +
                    "\n" +
                    "1 tablespoon finely grated ginger \n" +
                    "\n" +
                    "\n" +
                    "4 teaspoons kosher salt \n" +
                    "\n" +
                    "\n" +
                    "1 teaspoon Kashmiri red chili powder (see Cook's Note) \n" +
                    "\n" +
                    "\n" +
                    "1 teaspoon garam masala  \n" +
                    "\n" +
                    "\n" +
                    "1 teaspoon freshly ground black pepper \n" +
                    "\n" +
                    "\n" +
                    "1/2 teaspoon ground turmeric\n" +
                    "\n" +
                    "\n" +
                    "2 cloves garlic, finely grated \n" +
                    "\n" +
                    "\n" +
                    "8 boneless skinless chicken thighs (about 2 1/2 pounds)" +
                    "\n" +
                    "\n" +
                    "4 tablespoons ghee (see Cook's Note)\n" +
                    "\n" +
                    "\n" +
                    "1 large onion, sliced \n" +
                    "\n" +
                    "\n" +
                    "2 serrano chiles, stemmed, seeded and chopped \n" +
                    "\n" +
                    "\n" +
                    "Kosher salt \n" +
                    "\n" +
                    "\n" +
                    "1 tablespoon finely grated ginger \n" +
                    "\n" +
                    "\n" +
                    "4 cloves garlic, finely grated \n" +
                    "\n" +
                    "\n" +
                    "2 teaspoons dried whole fenugreek leaves (see Cook's Note) \n" +
                    "\n" +
                    "\n" +
                    "2 teaspoons garam masala \n" +
                    "\n" +
                    "\n" +
                    "1 teaspoon Kashmiri red chili powder \n" +
                    "\n" +
                    "\n" +
                    "1 teaspoon Hungarian paprika \n" +
                    "\n" +
                    "\n" +
                    "One 28-ounce can whole peeled tomatoes \n" +
                    "\n" +
                    "\n" +
                    "1/4 cup heavy cream  \n" +
                    "\n" +
                    "\n" +
                    "Chopped cilantro leaves and tender stems, for serving \n" +
                    "\n" +
                    "\n" +
                    "Basmati rice, for serving \n" +
                    "\n" +
                    "\n" +
                    "Naan, for serving" +
                    "\n",
            instructions = "1. For the chicken marinade: Whisk together the yogurt, ginger, salt, chili powder, garam masala, pepper, turmeric and garlic in a large bowl until combined. Toss the chicken in the spiced yogurt marinade until evenly coated. Wrap tightly with plastic wrap and refrigerate at least 3 hours and up to 24. (Overnight works best.)\n" +
                    "2. For the sauce: Melt the ghee in a large Dutch oven or wide heavy pot over medium heat. Add the onions and serrano, season with 1 teaspoon salt and cook, stirring occasionally, until the onions are golden and beginning to caramelize, 8 to 10 minutes. Add the ginger and garlic and cook, stirring, until very fragrant and the ginger starts to turn golden and sticks to the bottom of the pot, 2 to 3 minutes. Add the fenugreek leaves, garam masala, chili powder and paprika and cook, stirring occasionally, until very fragrant, about 1 minute. Add the tomatoes, breaking them up into pieces with a spoon, and bring to a boil. Reduce the heat and simmer uncovered, stirring occasionally, until the sauce has reduced by half and the tomatoes are very tender, about 30 minutes.  \n" +
                    "3. Let the hot sauce cool for about 5 minutes or so, then transfer it to a blender filling no more than halfway. (If your blender is small, you may need to work in batches.) Remove the center cap from the lid and place it on the blender. Cover the lid with a kitchen towel to catch splatters, and pulse until smooth. Add 1/4 cup heavy cream and puree until creamy. Pour into a clean pot and bring to a simmer. Season with salt.    \n" +
                    "4. Meanwhile, position a rack directly under the broiler and preheat to high. Line a rimmed baking sheet with foil and set a wire rack inside.  \n" +
                    "5. Arrange the chicken in a single layer on the rack. Broil until the chicken starts to brown in spots, 3 to 6 minutes per side (it will not be cooked through). Remove from the broiler. When cool enough to handle, cut the chicken into 1-inch pieces. Add the chicken to the simmering sauce, cover and cook until the chicken is cooked through, 8 to 10 minutes. \n" +
                    "6. Top the chicken and sauce with cilantro. Serve with rice and naan. \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/3/0/FNK_the-best-chicken-tikka-masala_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1567523604572.webp",
            rating = 3.6f
        )
    )
}