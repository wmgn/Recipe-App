package com.example.recipeapp.data

/* Returns initial list of recipes. */
fun recipeList(): List<Recipe> {
    return listOf(
        Recipe(
            id = "0",
            title = "Baked Salmon (Example 1)",
            ingredients = "2 tablespoons light brown sugar\n" +
                    "\n" +
                    "1/2 teaspoon paprika\n" +
                    "\n" +
                    "1/2 teaspoon garlic powder\n" +
                    "\n" +
                    "1/4 teaspoon cayenne pepper\n" +
                    "\n" +
                    "Kosher salt and freshly ground black pepper\n" +
                    "\n" +
                    "1/4 cup panko breadcrumbs\n" +
                    "\n" +
                    "1/2 cup parsley leaves, chopped\n" +
                    "\n" +
                    "2 tablespoons unsalted butter, melted\n" +
                    "\n" +
                    "1 1/2 pounds skin-on salmon fillet, preferably center-cut\n" +
                    "\n" +
                    "1 tablespoon Dijon\n" +
                    "\n",
            instructions = "1. Preheat the oven to 425 degrees F. Line a baking sheet with foil. Mix the brown sugar, paprika, garlic powder, cayenne pepper, 1 teaspoon kosher salt and a generous amount of freshly ground black pepper in a small bowl. Mix the panko with the parsley, butter, 1/4 teaspoon kosher salt and a few grinds of black pepper in another small bowl.\n" +
                    "\n2. Place the salmon skin-side down on the prepared baking sheet and spread the surface with the Dijon. Press the brown sugar mixture all over the salmon then top with the breadcrumb mixture. Crimp all four sides of the foil to create a border around the salmon, this will help collect the juices so they don't spread and burn. Bake until the breadcrumbs are golden brown, and the salmon is firm and flakes easily when pressed, 15 to 18 minutes. Cut into four equal portions for serving. \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/12/20/0/FNK_Baked-Salmon_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1576855635102.webp",
            rating = 4.7f
        ),
        Recipe(
            id = "1",
            title = "Steamed Dumplings (Example 2)",
            ingredients = "1/2 pound firm tofu\n" +
                    "\n" +
                    "1/2 cup coarsely grated carrots\n" +
                    "\n" +
                    "1/2 cup shredded Napa cabbage\n" +
                    "\n" +
                    "2 tablespoons finely chopped red pepper\n" +
                    "\n" +
                    "2 tablespoons finely chopped scallions\n" +
                    "\n" +
                    "2 teaspoons finely minced fresh ginger\n" +
                    "\n" +
                    "1 tablespoon chopped cilantro leaves\n" +
                    "\n" +
                    "1 tablespoon soy sauce\n" +
                    "\n" +
                    "1 tablespoon hoisin sauce\n" +
                    "\n" +
                    "2 teaspoons sesame oil\n" +
                    "\n" +
                    "1 egg, lightly beaten\n" +
                    "\n" +
                    "1 teaspoon kosher salt\n" +
                    "\n" +
                    "1/4 teaspoon freshly ground black pepper\n" +
                    "\n" +
                    "Bowl of water, plus additional water for steamer\n" +
                    "\n" +
                    "35 to 40 small wonton wrappers\n" +
                    "\n" +
                    "Non-stick vegetable spray, for the steamer\n" +
                    "\n",
            instructions = "1. Preheat the oven to 200 degrees F.\n" +
                    "\n2. Cut the tofu in half horizontally and lay between layers of paper towels. Place on a plate, top with another plate, and place a weight on top (a 14-ounce can of vegetables works well). Let stand 20 minutes. After 20 minutes, cut the tofu into 1/4-inch cubes and place in a large mixing bowl. Add the carrots, cabbage, red pepper, scallions, ginger, cilantro, soy sauce, hoisin, sesame oil, egg, salt, and pepper. Lightly stir to combine.\n" +
                    "\n3. To form the dumplings, remove 1 wonton wrapper from the package, covering the others with a damp cloth. Brush the edges of the wrapper lightly with water. Place 1/2 rounded teaspoon of the tofu mixture in the center of the wrapper. Shape as desired. Set on a sheet pan and cover with a damp cloth. Repeat procedure until all of the filling is gone.\n" +
                    "\n4. Using a steaming apparatus of your choice, bring 1/4 to 1/2-inch of water to a simmer over medium heat. Spray the steamer's surface lightly with the non-stick vegetable spray to prevent sticking. Place as many dumplings as will fit into a steamer, without touching each other. Cover and steam for 10 to 12 minutes over medium heat. Remove the dumplings from the steamer to a heatproof platter and place in oven to keep warm. Repeat until all dumplings are cooked.\n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2008/2/27/0/vegetarian_dumplings.jpg.rend.hgtvcom.476.357.suffix/1383056269084.jpeg",
            rating = 5.0f
        ),
        Recipe(
            id = "2",
            title = "Ramen (Example 3)",
            ingredients = "2 onions, halved\n" +
                    "\n" +
                    "1-inch piece fresh ginger, peeled\n" +
                    "\n" +
                    "2 tablespoons finely chopped bacon\n" +
                    "\n" +
                    "2 cloves garlic, minced\n" +
                    "\n" +
                    "2 green onions\n" +
                    "\n" +
                    "1 leek, washed and halved\n" +
                    "\n" +
                    "2 quarts broth (chicken, pork or veggie)\n" +
                    "\n" +
                    "1/4 cup soy sauce\n" +
                    "\n" +
                    "2 tablespoons mirin\n" +
                    "\n" +
                    "1/2 teaspoon sea salt\n" +
                    "\n" +
                    "Pork Belly:\n" +
                    "\n" +
                    "1 1/2 pound-slab boneless pork belly, skin-on\n" +
                    "\n" +
                    "1/4 cup kosher salt\n" +
                    "\n" +
                    "1/4 cup sugar\n" +
                    "\n" +
                    "1 teaspoon freshly ground black pepper\n" +
                    "\n" +
                    "1 cup sake\n" +
                    "\n" +
                    "Ramen:\n" +
                    "\n" +
                    "1 pound ramen noodles\n" +
                    "\n" +
                    "4 soft-boiled eggs\n" +
                    "\n" +
                    "1/2 cup finely chopped green onions\n" +
                    "\n" +
                    "1/4 cup chili paste\n" +
                    "\n" +
                    "4 pieces nori\n" +
                    "\n",
            instructions = "1. For the broth: Preheat the oven to broil. Place the onion and ginger on a baking sheet and broil until blackened on top, about 10 minutes.\n" +
                    "\n2. Cook the bacon in a large pot over low heat until all of the fat is rendered out and the bacon is crisp, about 10 minutes. Put the roasted onion and ginger, the garlic, green onions, leek, broth, soy sauce, mirin and salt into the pot. Simmer for 2 to 3 hours, while you cook your pork belly. Strain to serve.\n" +
                    "\n3. For the pork belly: Preheat the oven to 350 degrees F. Sprinkle the belly with the salt, sugar and pepper. Throw the seasoned belly in a roasting pan and pour the sake over it. Roast for 1 hour 30 minutes, and then bring the heat up to 450 degrees F and let it caramelize. It should be tender but not mushy.\n" +
                    "\n4. Let the belly cool to room temperature. Wrap it up tight in plastic and put it in the fridge until it¿s thoroughly chilled through. At that point, slice it into nice, thick slabs. Set aside for ramen.\n" +
                    "\n5. To assemble the ramen: Cook the ramen noodles according to package instructions. Place the noodles into a bowl, followed by pork belly and top with broth. Add whatever toppings you like!\n",
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
                    "1 tablespoon baking powder  \n" +
                    "\n" +
                    "2 cups fresh blueberries  \n" +
                    "\n" +
                    "1 cup buttermilk \n" +
                    "\n" +
                    "1/4 cup sour cream \n" +
                    "\n" +
                    "2 teaspoons pure vanilla extract \n" +
                    "\n" +
                    "2 teaspoons kosher salt \n" +
                    "\n" +
                    "Nonstick cooking spray \n" +
                    "\n" +
                    "10 tablespoons unsalted butter, at room temperature  \n" +
                    "\n" +
                    "1 1/4 cup granulated sugar  \n" +
                    "\n" +
                    "1 teaspoon finely grated lemon zest \n" +
                    "\n" +
                    "1 large egg \n" +
                    "\n" +
                    "2 large egg yolks \n" +
                    "\n" +
                    "3 tablespoons raw sugar  \n" +
                    "\n",
            instructions = "1. Whisk together 2 1/2 cups of the flour and the baking powder in a medium bowl until completely combined. Toss 1 1/2 cups of the blueberries with the remaining 2 tablespoons flour in a medium bowl until completely coated. Whisk together the buttermilk, sour cream, vanilla and salt in a large measuring cup until smooth.\n" +
                    "\n2. Arrange a rack in the center of the oven and preheat to 425 degrees F. Spray the top of a 12-cup muffin tin with nonstick spray and line with standard cupcake liners. (It's important to spray the top of the pan because the muffin tops will stick to the pan if you don't.)  \n" +
                    "\n3. Beat the butter, granulated sugar and lemon zest with an electric mixer on medium-high speed until light and fluffy, occasionally scraping down the sides and bottom of the bowl, 3 to 4 minutes. Add the egg and yolks and continue beating until fully incorporated, about 2 minutes.  \n" +
                    "\n4. With the mixer on low, add the dry ingredients in 3 additions, alternating with the wet ingredients in 2 additions, beginning and ending with the dry ingredients. Fold in the blueberries until evenly distributed (be careful not to overmix). \n" +
                    "\n5. Divide the batter evenly among the prepared muffin cups with a heaping 1/3 cup per muffin. Top the batter with the remaining 1/2 cup blueberries, gently pressing to adhere (you should have 4 to 5 berries per muffin). Sprinkle with the raw sugar.  \n" +
                    "\n6. Bake the muffins, rotating the pan halfway through, until a tester inserted into the center comes out clean, 25 to 30 minutes. Transfer the pan to a wire rack and let the muffins cool in the pan for 5 minutes. Then remove the muffins onto the wire rack to cool completely.  \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/9/0/FNK_the-best-blueberry-muffins_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1568040661674.webp",
            rating = 1.9f
        ),
        Recipe(
            id = "6",
            title = "Creme Brulee (Example 7)",
            ingredients = "2 1/2 cups heavy cream\n" +
                    "\n" +
                    "1 vanilla bean, split lengthwise  \n" +
                    "\n" +
                    "1/4 teaspoon kosher salt \n" +
                    "\n" +
                    "12 tablespoons sugar \n" +
                    "\n" +
                    "7 large egg yolks  ",
            instructions = "1. Arrange a rack in the center of the oven and preheat to 300 degrees F. Line a large heavy roasting pan (a turkey roasting pan works great) with a clean kitchen towel and place 4 six-ounce ramekins on top of the towel spaced a few inches apart.\n" +
                    "\n2. Heat the cream in a medium saucepan over medium heat. Using the back of a paring knife, scrape the vanilla seeds from both halves of the pod. Add the seeds and pod to the cream. Whisk in the salt and 3 tablespoons of the sugar and bring to a boil. Remove from the heat.  \n" +
                    "\n3. Vigorously whisk the yolks and 3 more tablespoons of the sugar in a large bowl until pale yellow and very thick and creamy, about 2 minutes. Alternatively, you can use an electric mixer on high speed and beat until pale yellow and very thick and creamy, about 1 minute.  \n" +
                    "\n4. Whisking the yolks constantly, add a couple of teaspoons at a time from 1 cup of the hot cream, then increase to a steady stream until the cream is fully incorporated. (Don't pour too much hot cream at once or you'll end up with scrambled eggs.) The yolks are now tempered. Whisk the tempered yolks back into the remaining hot cream until combined. Strain through a fine mesh sieve into a large measuring cup or medium pitcher for easier pouring; discard the vanilla pods. \n" +
                    "\n5. Skim the foam off the top of the custard by placing a clean paper towel on top and lightly pressing down so it touches the surface and absorbs some of the liquid. This will make for a completely smooth and silky custard. Fill the ramekins with the custard, about 3/4 cup per ramekin.  \n" +
                    "\n6. Carefully pour boiling water into the roasting pan halfway up the sides of the ramekins without getting any water in the custard. Cover the pan tightly with foil and bake until the custard is set around the edges but still has a slight jiggle in the center, 35 to 45 minutes. Carefully remove the roasting pan from the oven and transfer the ramekins to a wire rack to cool for 30 minutes. Then refrigerate until very cold, about 3 hours.  \n" +
                    "\n7. Just before serving, evenly spread 1 tablespoon of the sugar over the top of a custard. Hold a kitchen torch 2 inches above the surface. Starting in the center of the ramekin, move the flame in a circular motion and work your way out to the edges to caramelize the sugar. Repeat with the remaining sugar and custards.  \n" +
                    "\n8. Alternatively, arrange a rack in the top position of the oven and heat the broiler on high. Place the ramekins on a rack set inside a baking sheet and broil until deep golden brown, 15 to 60 seconds, checking every 10 seconds.  \n" +
                    "\n9. Freeze the custards for 5 minutes before serving (see Cook’s Note).  \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/3/0/FNK_the-best-creme-brulee_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1567523601035.webp",
            rating = 0.5f
        ),
        Recipe(
            id = "7",
            title = "Chicken Tikka Masala (Example 8)",
            ingredients = "1 1/4 cup whole milk yogurt\n" +
                    "\n" +
                    "1 tablespoon finely grated ginger \n" +
                    "\n" +
                    "4 teaspoons kosher salt \n" +
                    "\n" +
                    "1 teaspoon Kashmiri red chili powder (see Cook's Note) \n" +
                    "\n" +
                    "1 teaspoon garam masala  \n" +
                    "\n" +
                    "1 teaspoon freshly ground black pepper \n" +
                    "\n" +
                    "1/2 teaspoon ground turmeric\n" +
                    "\n" +
                    "2 cloves garlic, finely grated \n" +
                    "\n" +
                    "8 boneless skinless chicken thighs (about 2 1/2 pounds)" +
                    "\n" +
                    "4 tablespoons ghee (see Cook's Note)\n" +
                    "\n" +
                    "1 large onion, sliced \n" +
                    "\n" +
                    "2 serrano chiles, stemmed, seeded and chopped \n" +
                    "\n" +
                    "Kosher salt \n" +
                    "\n" +
                    "1 tablespoon finely grated ginger \n" +
                    "\n" +
                    "4 cloves garlic, finely grated \n" +
                    "\n" +
                    "2 teaspoons dried whole fenugreek leaves (see Cook's Note) \n" +
                    "\n" +
                    "2 teaspoons garam masala \n" +
                    "\n" +
                    "1 teaspoon Kashmiri red chili powder \n" +
                    "\n" +
                    "1 teaspoon Hungarian paprika \n" +
                    "\n" +
                    "One 28-ounce can whole peeled tomatoes \n" +
                    "\n" +
                    "1/4 cup heavy cream  \n" +
                    "\n" +
                    "Chopped cilantro leaves and tender stems, for serving \n" +
                    "\n" +
                    "Basmati rice, for serving \n" +
                    "\n" +
                    "Naan, for serving" +
                    "\n",
            instructions = "1. For the chicken marinade: Whisk together the yogurt, ginger, salt, chili powder, garam masala, pepper, turmeric and garlic in a large bowl until combined. Toss the chicken in the spiced yogurt marinade until evenly coated. Wrap tightly with plastic wrap and refrigerate at least 3 hours and up to 24. (Overnight works best.)\n" +
                    "\n2. For the sauce: Melt the ghee in a large Dutch oven or wide heavy pot over medium heat. Add the onions and serrano, season with 1 teaspoon salt and cook, stirring occasionally, until the onions are golden and beginning to caramelize, 8 to 10 minutes. Add the ginger and garlic and cook, stirring, until very fragrant and the ginger starts to turn golden and sticks to the bottom of the pot, 2 to 3 minutes. Add the fenugreek leaves, garam masala, chili powder and paprika and cook, stirring occasionally, until very fragrant, about 1 minute. Add the tomatoes, breaking them up into pieces with a spoon, and bring to a boil. Reduce the heat and simmer uncovered, stirring occasionally, until the sauce has reduced by half and the tomatoes are very tender, about 30 minutes.  \n" +
                    "\n3. Let the hot sauce cool for about 5 minutes or so, then transfer it to a blender filling no more than halfway. (If your blender is small, you may need to work in batches.) Remove the center cap from the lid and place it on the blender. Cover the lid with a kitchen towel to catch splatters, and pulse until smooth. Add 1/4 cup heavy cream and puree until creamy. Pour into a clean pot and bring to a simmer. Season with salt.    \n" +
                    "\n4. Meanwhile, position a rack directly under the broiler and preheat to high. Line a rimmed baking sheet with foil and set a wire rack inside.  \n" +
                    "\n5. Arrange the chicken in a single layer on the rack. Broil until the chicken starts to brown in spots, 3 to 6 minutes per side (it will not be cooked through). Remove from the broiler. When cool enough to handle, cut the chicken into 1-inch pieces. Add the chicken to the simmering sauce, cover and cook until the chicken is cooked through, 8 to 10 minutes. \n" +
                    "\n6. Top the chicken and sauce with cilantro. Serve with rice and naan. \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/3/0/FNK_the-best-chicken-tikka-masala_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1567523604572.webp",
            rating = 3.6f
        )
    )
}