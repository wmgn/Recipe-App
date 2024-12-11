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
        ),
        /*Recipe(
            id = "8",
            title = "Turkey Meatloaf",
            ingredients = "1/4 cup olive oil\n" +
                    "\n" +
                    "1 large onion, chopped  \n" +
                    "\n" +
                    "2 teaspoons fresh thyme leaves \n" +
                    "\n" +
                    "1 teaspoon minced fresh sage  \n" +
                    "\n" +
                    "Kosher salt and freshly ground black pepper \n" +
                    "\n" +
                    "2 cloves garlic, grated \n" +
                    "\n" +
                    "1 tablespoon tomato paste \n" +
                    "\n" +
                    "3 tablespoons Worcestershire sauce \n" +
                    "\n" +
                    "3/4 cup panko breadcrumbs \n" +
                    "\n" +
                    "1/2 cup chicken broth \n" +
                    "\n" +
                    "3 pounds ground turkey \n" +
                    "\n" +
                    "2 large eggs \n" +
                    "\n" +
                    "1/2 cup ketchup ",
            instructions = "1. Preheat the oven to 425 degrees F. Line a baking sheet with foil.\n" +
                    "2. Heat the olive oil in a large skillet over medium heat. Add the onions, thyme, sage, 1 teaspoon salt and 1/2 teaspoon pepper. Cook, stirring often, until the onions are softened, about 10 minutes. Add the garlic and cook 1 minute more. Add the tomato paste and cook for 1 minute, stirring to incorporate. Stir in the Worcestershire. Remove from the heat and allow to cool.  \n" +
                    "3. Add the panko to a large mixing bowl and pour over the chicken broth so the breadcrumbs soak up the liquid. Add the turkey, eggs, 2 teaspoons salt, 1/2 teaspoon pepper and the cooled onion mixture and mix well with your hands until well combined. Form the mixture into a 10-by-5-inch loaf on the foil-lined baking sheet. Coat the top and sides with the ketchup.  \n" +
                    "4. Put the meatloaf in the oven and reduce the oven temperature to 350 degrees F. Bake until a thermometer inserted in the center of the loaf reads 165 degrees F, 45 minutes to 1 hour. Let cool slightly before slicing and serving.\n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/17/0/FNK_Best-Turkey-Meatloaf_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1568735467631.webp",
            rating = 2.5f
        ),
        Recipe(
            id = "9",
            title = "Stuffed Peppers",
            ingredients = "6 large red, orange or yellow bell peppers\n" +
                    "\n" +
                    "3 tablespoons olive oil\n" +
                    "\n" +
                    "1 pound ground beef \n" +
                    "\n" +
                    "2 medium onions, chopped \n" +
                    "\n" +
                    "4 cloves garlic, finely grated \n" +
                    "\n" +
                    "2 teaspoons thyme leaves  \n" +
                    "\n" +
                    "Kosher salt and freshly ground black pepper \n" +
                    "\n" +
                    "4 plum tomatoes, cored and cut into 1/2-inch pieces \n" +
                    "\n" +
                    "2 tablespoons tomato paste  \n" +
                    "\n" +
                    "1 cup dry white wine \n" +
                    "\n" +
                    "1 cup low-sodium chicken broth \n" +
                    "\n" +
                    "2 cups cooked rice  \n" +
                    "\n" +
                    "2 cups shredded Muenster cheese \n" +
                    "\n",
            instructions = "If your peppers don't sit upright on your cutting board, trim about 1/8-inch off the bottoms to even them out so they can stand without falling over. Cut the top off each pepper about 1/2-inch down. Remove and discard the stems, then finely chop the remaining flesh from the tops. Scoop out the seeds and as much of the membranes as you can. Place the peppers in a large microwave-safe bowl with 1/2 cup water. Cover with plastic wrap and microwave on high power for 12 minutes. Carefully uncover and let them sit until ready to assemble.\n" +
                    "Heat 2 tablespoons of the oil in a large skillet over medium-high heat. Spread the beef in an even layer and cook undisturbed until lightly browned, about 3 minutes. Toss and continue to cook, breaking up any clumps with the back of a spoon and scraping up any browned bits from the pan until the meat is lightly browned all over, 6 to 8 minutes. Transfer the browned meat to a large bowl with a slotted spoon.  \n" +
                    "Reduce the heat to medium. Heat the remaining 1 tablespoon oil and add the reserved chopped peppers, onions, garlic, thyme, 4 teaspoons salt and 1/2 teaspoon pepper and cook, stirring occasionally, until tender but not browned, 10 to 12 minutes. Add the tomatoes and cook, stirring occasionally, until falling apart and much of the liquid has evaporated, about 7 minutes.  \n" +
                    "Stir in the tomato paste and cook, stirring constantly until brick red colored, about 1 minute. Stir in the wine and cook until the mixture is reduced, very thick and no smell of alcohol remains, 6 to 8 minutes. Add the broth and bring to a boil. Transfer to the bowl with the beef. Stir in the rice until completely combined. (The mixture will be wet.) Season with salt and pepper.  \n" +
                    "Arrange a rack in the center of the oven and preheat to 450 degrees F.  \n" +
                    "Place the peppers cut-side up in a 13-by-9-inch baking dish. Spoon the filling into the peppers, gently pressing it in with the back of a spoon. Be careful not to overstuff and split the sides of the peppers. Bake for 15 minutes. Then top with the cheese and continue baking until the filling is heated through and the cheese is browned in spots, 10 to 12 minutes.  \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/3/0/FNK_the-best-stuffed-peppers_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1567523590914.webp",
            rating = 2.5f
        ),
        Recipe(
            id = "10",
            title = "Chicken Fried Steak",
            ingredients = "Four 3- to 4-ounce cube steaks (see Cook's Note)\n" +
                    "\n" +
                    "Kosher salt and freshly ground black pepper \n" +
                    "\n" +
                    "3 tablespoons unsalted butter \n" +
                    "\n" +
                    "1 1/2 cups plus 3 tablespoons all-purpose flour \n" +
                    "\n" +
                    "2 1/4 cups whole milk \n" +
                    "\n" +
                    "1 1/2 cups cornstarch \n" +
                    "\n" +
                    "1 tablespoon Hungarian paprika \n" +
                    "\n" +
                    "1 teaspoon garlic powder \n" +
                    "\n" +
                    "1 cup buttermilk  \n" +
                    "\n" +
                    "1 large egg, beaten \n" +
                    "\n" +
                    "1 tablespoon hot sauce, such as Frank's RedHot \n" +
                    "\n" +
                    "4 1/2 cups vegetable oil\n" +
                    "\n",
            instructions = "Liberally sprinkle the steaks with salt and pepper (see Cook's Note). Put them on a rack set inside a rimmed baking sheet and let sit at room temperature while you make the gravy.\n" +
                    "Melt the butter in a medium saucepan over medium-high heat. Stir in 3 tablespoons of the flour until combined and cook until golden and bubbling, about 1 minute. Whisk in the whole milk, 1 1/4 teaspoons salt and 1/4 teaspoon pepper and cook, whisking frequently, until the gravy boils. Reduce the heat to medium and cook, whisking occasionally, until the gravy thickens, 2 to 3 minutes. Remove from the heat and keep warm; it will seem loose but will thicken as it sits.\n" +
                    "Whisk the remaining 1 1/2 cups flour, cornstarch, paprika, garlic powder and 1 1/2 teaspoons salt in a large bowl. Whisk the buttermilk, egg and hot sauce in a medium bowl. Working with 1 steak at a time, dredge in the seasoned flour, turning to coat and packing into the crevices. Shake to remove any excess and return to the rack. Repeat with the remaining steaks.\n" +
                    "Pour 3 tablespoons of the buttermilk mixture into the seasoned flour and work it in with your fingers; it should feel like wet sand with some clumps. (These clumps will give the steak a crispy, shaggy crust.) Dip the dredged steaks into the remaining buttermilk mixture, allowing any excess to drip off. Pack the moistened flour firmly onto each steak. Very gently shake off any excess and return to the rack. Refrigerate at least 30 minutes.\n" +
                    "Pour the oil into a large cast-iron skillet fitted with a deep-fry thermometer (the oil should come about halfway up the sides). Heat the oil over high heat until the thermometer registers 350 degrees F. Fry the steaks in 2 batches until golden brown, about 1 1/2 minutes per side. Transfer to paper towels to drain.\n" +
                    "Whisk the warm cream gravy to loosen it and serve over the chicken-fried steak.\n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/3/0/FNK_the-best-chicken-fried-steak_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1567523589755.webp",
            rating = 4.9f
        ),
        Recipe(
            id = "11",
            title = "Cheesy Potatoes",
            ingredients = "4 1/4 pounds russet potatoes (about 5 medium), peeled and diced (about 8 cups)\n" +
                    "\n" +
                    "Kosher salt and freshly ground black pepper\n" +
                    "\n" +
                    "4 tablespoons (1/2 stick) unsalted butter\n" +
                    "\n" +
                    "1/2 cup all-purpose flour\n" +
                    "\n" +
                    "2 teaspoons chicken bouillon\n" +
                    "\n" +
                    "1 cup whole milk\n" +
                    "\n" +
                    "Pinch cayenne pepper\n" +
                    "\n" +
                    "16 ounces Cheddar, grated (about 4 cups)\n" +
                    "\n" +
                    "8 ounces sour cream (about 3/4 cup)\n" +
                    "\n" +
                    "3 scallions, thinly sliced, whites and greens separated\n" +
                    "\n" +
                    "2 cups cornflakes\n" +
                    "\n",
            instructions = "Preheat the oven to 400 degrees F.\n" +
                    "Put the potatoes in a large pot and add enough water to cover them by 2 inches. Stir in 1 teaspoon salt and bring to a boil over high heat. Simmer until you can smash them with the back of a spoon, 5 to 6 minutes. Drain the potatoes, add to a very large bowl and set aside.\n" +
                    "Meanwhile, melt the butter in a medium saucepan over medium heat. Add the flour and whisk to form a sandy mixture. Let the roux cook, untouched, until it's slightly toasted and smells a little nutty, 2 to 3 minutes.\n" +
                    "Mix the bouillon with 2 cups water in a large liquid measuring cup until dissolved. Add the milk, cayenne, 1 1/2 teaspoons salt and a generous amount of black pepper to the measuring cup. Whisking constantly, slowly pour the milk mixture into the pot with the roux and whisk until completely smooth. Cook, whisking frequently, until the flour taste has dissipated and the mixture is thick enough to coat the back of a spoon, 8 to 10 minutes.\n" +
                    "Turn the heat to low, add 2 cups of the Cheddar and cook, whisking constantly, until the cheese is melted and the sauce is very smooth, 2 to 3 minutes. Remove the pot from the heat and add the sour cream. Whisk until combined. Pour the sauce over the potatoes, add the scallion whites and fold the mixture until everything is evenly coated.\n" +
                    "Pour the mixture into a 9-by-13-inch baking dish and sprinkle with the remaining Cheddar. Scatter the cornflakes over the top and bake until the cheese mixture is bubbling on the sides, the cornflakes are slightly more golden and the potatoes are very soft, 45 to 50 minutes. Let sit for 10 minutes, then garnish with the scallion greens. Serve warm.\n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2023/4/03/FNK_TheBestCheesyPotatoes_H.jpg.rend.hgtvcom.826.620.suffix/1680660241479.webp",
            rating = 2.5f
        ),
        Recipe(
            id = "12",
            title = "Chewy Chocolate Chip Cookies",
            ingredients = "2 3/4 cups all-purpose flour (see Cook's Note)\n" +
                    "\n" +
                    "1 1/2 teaspoons fine salt \n" +
                    "\n" +
                    "1 teaspoon baking powder \n" +
                    "\n" +
                    "1 teaspoon baking soda \n" +
                    "\n" +
                    "2 1/2 sticks unsalted butter, softened \n" +
                    "\n" +
                    "1 3/4 cups packed dark brown sugar \n" +
                    "\n" +
                    "2 large eggs, at room temperature \n" +
                    "\n" +
                    "2 teaspoons pure vanilla extract or vanilla bean paste \n" +
                    "\n" +
                    "One 12-ounce bag semisweet chocolate chips (about 2 cups) \n" +
                    "\n",
            instructions = "Sift the flour, salt, baking powder and baking soda into a large bowl.\n" +
                    "Beat the butter and brown sugar in another large bowl with an electric mixer on medium-high speed until pale and fluffy, about 4 minutes, scraping down the sides of the bowl as needed. (Use the paddle attachment for a stand mixer.) Beat in the eggs one at a time, then beat in the vanilla. Reduce the mixer speed to low. Add the dry ingredients and beat until combined. Stir in the chocolate chips by hand.  \n" +
                    "Press plastic wrap directly onto the surface of the dough and refrigerate at least 1 hour or preferably overnight. \n" +
                    "Preheat the oven to 375 degrees F. Line 2 baking sheets with parchment paper.  \n" +
                    "Use a 1-ounce ice cream scoop to scoop half the dough onto the prepared baking sheets, spacing about 2 inches apart. Chill the remaining dough while you bake the first batch. \n" +
                    "Bake until the cookies are golden around the edges but still soft in the middle, 12 to 15 minutes. Let the cookies cool for 10 minutes on the baking sheets, then transfer them to a wire rack to cool completely. Cool the baking sheets completely, then line with parchment paper again if necessary and repeat the scooping and baking process with the remaining dough. \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/3/0/FNK_the-best-chewy-chocolate-chip-cookies_H_s4x3.jpg.rend.hgtvcom.1280.720.suffix/1568050722773.webp",
            rating = 5.0f
        ),
        Recipe(
            id = "13",
            title = "Pot Roast",
            ingredients = "One 4-pound boneless beef chuck roast, trimmed and tied\n" +
                    "\n" +
                    "4 tablespoons kosher salt \n" +
                    "\n" +
                    "6 tablespoons vegetable oil \n" +
                    "\n" +
                    "2 large onions, cut into 2-inch wedges \n" +
                    "\n" +
                    "4 cloves garlic, finely grated \n" +
                    "\n" +
                    "1 tablespoon tomato paste \n" +
                    "\n" +
                    "1 cup dry red wine \n" +
                    "\n" +
                    "2 bay leaves \n" +
                    "\n" +
                    "3 tablespoons all-purpose flour \n" +
                    "\n" +
                    "1 cup low-sodium chicken broth \n" +
                    "\n" +
                    "1 1/2 teaspoons freshly ground black pepper \n" +
                    "\n" +
                    "7 carrots, peeled, cut into 3-inch pieces \n" +
                    "\n" +
                    "4 stalks celery, cut into 3-inch pieces \n" +
                    "\n" +
                    "2 pounds medium red potatoes, quartered (halved if small) \n" +
                    "\n" +
                    "Chopped flat-leaf parsley, for garnish \n" +
                    "\n" +
                    "Chopped chives, for garnish \n" +
                    "\n",
            instructions = "Sprinkle the roast with 3 tablespoons of the salt, rubbing into the grain and covering all sides. Wrap tightly in plastic wrap and refrigerate at least 3 hours and up to 3 days.\n" +
                    "Arrange a rack in the lower third of the oven and preheat to 275 degrees F. \n" +
                    "Heat 2 tablespoons of the oil in a large heavy pot or Dutch oven over high heat. Cook the meat, turning occasionally, until browned on all sides, 10 to 12 minutes. Transfer to a plate. \n" +
                    "Reduce the heat to medium-high and heat the remaining 4 tablespoons oil in the pot. Cook the onions and the remaining 1 tablespoon salt, stirring occasionally, until browned but not completely cooked through, 6 to 8 minutes (it's ok if the onion wedges break apart). Add the garlic and tomato paste and cook, stirring occasionally, until the paste is brick red and the garlic is fragrant, about 1 minute. Add the wine and bay leaves and cook, stirring occasionally and scraping the bottom of the pot, until slightly reduced and you can no longer smell the alcohol, about 4 minutes. Add the flour, stir to coat the onions and cook for 1 minute. Stir in the broth and pepper and bring to a boil.  \n" +
                    "Nestle the meat and any accumulated juices into the onions. Arrange the carrots, celery and potatoes around the roast, pushing them into the onions and surrounding the beef. Cover and transfer to the oven. Cook until the meat is very tender but still holds its shape and is not falling apart, 3 to 3 1/2 hours. Let rest, covered, at least 45 minutes before serving.  \n" +
                    "Transfer the roast to a cutting board and remove the twine with scissors, if necessary. Slice against the grain. \n" +
                    "Divide the vegetables among plates and arrange the sliced beef over top. Spoon sauce over the top garnish with parsley and chives. \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/3/0/FNK_the-best-pot-roast_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1567523587365.webp",
            rating = 4.6f
        ),
        Recipe(
            id = "14",
            title = "Classic Strawberry Shortcake",
            ingredients = "Shortcakes:\n" +
                    "\n" +
                    "1 cup heavy cream, plus more for brushing\n" +
                    "\n" +
                    "2 tablespoons sour cream \n" +
                    "\n" +
                    "1 teaspoon pure vanilla extract \n" +
                    "\n" +
                    "2 1/2 cups all-purpose flour, plus more for dusting (see Cook's Note) \n" +
                    "\n" +
                    "1/3 cup granulated sugar, plus more for sprinkling \n" +
                    "\n" +
                    "1 tablespoon baking powder \n" +
                    "\n" +
                    "1/2 teaspoon kosher salt \n" +
                    "\n" +
                    "1 stick (8 tablespoons) unsalted butter, cut into 1-inch cubes and frozen \n" +
                    "\n" +
                    "Filling:\n" +
                    "\n" +
                    "1 pound strawberries, hulled and sliced\n" +
                    "\n" +
                    "1/4 cup packed light brown sugar \n" +
                    "\n" +
                    "1 cup heavy cream \n" +
                    "\n" +
                    "2 tablespoons sour cream \n" +
                    "\n" +
                    "1 teaspoon pure vanilla extract \n" +
                    "\n",
            instructions = "For the shortcakes: Preheat the oven to 400 degrees F. Line a baking sheet with parchment paper.\n" +
                    "Whisk the heavy cream, sour cream and vanilla in a small bowl; refrigerate until ready to use. Pulse the flour, granulated sugar, baking powder and salt in a food processor until combined. Add the butter; pulse until the mixture looks like fine meal. Pour in the chilled heavy cream mixture and pulse until just combined. \n" +
                    "Lightly flour a work surface and dump the dough onto it. Pat out the dough 1/2-inch thick. Cut out as many biscuits as you can with a 2 1/2-inch biscuit cutter. Then pat the remaining dough out to 1/2-inch thick again. Cut more biscuits; you should get 12. \n" +
                    "Put 6 of the biscuits on the prepared baking sheet. Brush the tops generously with cream, then top each cream-brushed biscuit with one of the remaining biscuit rounds. (This makes it easier to split once they are baked.) Brush the top of each biscuit stack with more heavy cream and sprinkle 1 teaspoon granulated sugar on each biscuit.  \n" +
                    "Bake the biscuits until golden and puffed, about 30 minutes. Let cool for 5 minutes, then transfer to a wire rack and cool completely.  \n" +
                    "Meanwhile, for the topping: Toss the strawberries and 2 tablespoons of the brown sugar in a medium bowl. \n" +
                    "Just before serving, beat the heavy cream, sour cream, the remaining 2 tablespoons brown sugar and vanilla in a large bowl with a mixer on medium-high speed until soft peaks form, about 2 minutes.  \n" +
                    "Split the shortcakes in half. Spoon half the cream on the bottom of the biscuits, top evenly with the strawberries and top with the remaining cream. Put each biscuit top on and serve. \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/3/0/FNK_the-best-strawberry-shortcake_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1567523592727.webp",
            rating = 4.5f
        ),
        Recipe(
            id = "15",
            title = "Quiche Lorraine",
            ingredients = "Pastry Crust:\n" +
                    "\n" +
                    "1 cup all-purpose flour, plus more for dusting (see Cook's Note)\n" +
                    "\n" +
                    "Kosher salt \n" +
                    "\n" +
                    "1 stick (8 tablespoons) cold unsalted butter, cut into small pieces \n" +
                    "\n" +
                    "3 to 5 tablespoons ice water \n" +
                    "\n" +
                    "Filling:\n" +
                    "\n" +
                    "1 tablespoon unsalted butter\n" +
                    "\n" +
                    "1 small yellow onion, very thinly sliced \n" +
                    "\n" +
                    "Kosher salt and freshly ground black pepper \n" +
                    "\n" +
                    "4 ounces slab bacon, cut into 1/2-inch pieces \n" +
                    "\n" +
                    "2 teaspoons fresh thyme leaves \n" +
                    "\n" +
                    "1/2 cup shredded Gruyere (about 2 ounces) \n" +
                    "\n" +
                    "1 cup heavy cream \n" +
                    "\n" +
                    "2 large eggs \n" +
                    "\n",
            instructions = "For the pastry crust: Pulse the flour and 1/2 teaspoon salt in a food processor until combined. Add the butter and pulse until the flour looks like cornmeal. Sprinkle in 3 tablespoons ice water and pulse until the dough begins to come together. Pinch the dough with your fingers; if it doesn't hold together, add up to 2 more tablespoons ice water, 1 tablespoon at a time, and pulse again.\n" +
                    "Transfer the dough to a sheet of plastic wrap and pat into a disc. Wrap tightly and refrigerate until firm, at least 1 hour and preferably overnight. \n" +
                    "Lightly flour a work surface, then roll the dough into an 11-inch round, about 1/8 inch thick. Center the dough in a 9-inch fluted tart pan with removable bottom, with an even overhang of dough all around. Press the dough into the edges of the pan and the fluted sides. Roll the rolling pin over the top to cut off the extra dough (discard the extra). Poke the bottom and sides all over with a fork. Chill until completely cold, about 30 minutes. \n" +
                    "Meanwhile, position an oven rack in the lower third of the oven and preheat to 375 degrees F. \n" +
                    "Press a piece of parchment over the chilled crust, then fill with pie weights, raw beans or rice. Put the pan on a baking sheet. Bake until the crust is set and golden around the edges, about 40 minutes. Carefully remove the parchment and weights. Return to the oven and bake until the crust is dry and slightly golden, about 15 minutes more. Let cool completely, about 30 minutes. \n" +
                    "For the filling: Combine the butter, onion, 1/2 teaspoon salt and 1/2 cup water in a medium skillet over medium-low heat. Cook, stirring occasionally, until the onions are completely softened and all the water has evaporated, about 30 minutes.  \n" +
                    "Meanwhile, cook the bacon in a separate medium skillet over medium-low heat, stirring, until the fat has rendered and the bacon is crisp, 10 to 15 minutes.  \n" +
                    "When the onions have cooked for 30 minutes, add the bacon using a slotted spoon, then stir in 1 teaspoon of the thyme and 1/2 teaspoon pepper. Spread the onion mixture in the bottom of the crust and sprinkle with the Gruyere. Whisk together the cream, eggs and 1/2 teaspoon salt in a medium bowl until combined. Pour the cream mixture over the filling in the crust and top with the remaining 1 teaspoon thyme.  \n" +
                    "Bake the quiche on the baking sheet until set and golden, about 30 minutes. Let cool at least 30 minutes before serving.\n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/3/0/FNK_the-best-quiche-lorraine_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1567523605408.webp",
            rating = 2.6f
        ),
        Recipe(
            id = "16",
            title = "Chicken Cutlets",
            ingredients = "4 boneless, skinless chicken breasts (about 2 pounds)\n" +
                    "\n" +
                    "1 cup all-purpose flour\n" +
                    "\n" +
                    "Kosher salt and freshly ground black pepper\n" +
                    "\n" +
                    "2 teaspoons granulated garlic\n" +
                    "\n" +
                    "2 teaspoons onion powder\n" +
                    "\n" +
                    "1 teaspoon crushed red pepper flakes, optional\n" +
                    "\n" +
                    "3 large eggs\n" +
                    "\n" +
                    "2 1/2 cups panko breadcrumbs\n" +
                    "\n" +
                    "1/2 cup grated Pecorino-Romano\n" +
                    "\n" +
                    "1 stick (8 tablespoons) unsalted butter\n" +
                    "\n" +
                    "1/2 cup olive oil\n" +
                    "\n" +
                    "Lemon wedges, for serving, optional\n" +
                    "\n",
            instructions = "Place a wire rack inside a rimmed baking sheet. Preheat the oven to 200 degrees F.\n" +
                    "Cut the chicken breasts in half lengthwise making 8 roughly equal pieces. (They should look like large chicken tenders.) Place one sheet of plastic wrap on a clean cutting board. Put one chicken piece in the center of the plastic wrap and top with another sheet. Pound the chicken with the flat side of a meat mallet, starting in the center and working your way to the edges, until the chicken is 1/4 inch thick. Transfer to the prepared baking sheet. Repeat with the remaining chicken.\n" +
                    "Set up a standard breading station: mix the flour, 1 tablespoon kosher salt, 1 teaspoon granulated garlic, 1 teaspoon onion powder and 1/2 teaspoon freshly ground black pepper and 1/2 teaspoon crushed red pepper flakes if using, if using, in a shallow dish.\n" +
                    "Beat the eggs with 1 tablespoon water in a second shallow dish.\n" +
                    "Mix the panko, Pecorino-Romano, 1 tablespoon kosher salt, the remaining 1 teaspoon granulated garlic, the remaining 1 teaspoon onion powder, 1/2 teaspoon freshly ground black pepper and the remaining 1/2 teaspoon crushed red pepper flakes if using, in a third shallow dish.\n" +
                    "Dredge one piece of chicken in the flour mixture, turning to coat evenly. Shake off any excess, then dip into the egg mixture, turning to fully coat it on both sides. Let the excess egg drip off, then press the chicken firmly into the breadcrumb mixture, turning to coat on both sides and packing the crumbs into any crevices. Transfer the chicken back to the baking sheet and repeat with the remaining chicken pieces.\n" +
                    "Line a clean baking sheet with a clean wire rack. Heat 2 tablespoons of the unsalted butter and 2 tablespoons of the olive oil in a large skillet over medium-low heat. Add 2 pieces of chicken and cook until the breading is golden-brown and crisp and the chicken is just cooked through, 3 to 5 minutes per side. Transfer to the clean wire rack, season with salt and hold in the oven at 200 degrees F to keep warm. Wipe the skillet clean and repeat with the remaining butter, olive oil and chicken, making 4 batches in total.\n" +
                    "Serve with lemon wedges, if desired.\n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/12/20/0/FNK_Chicken-Cutlet_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1576855328048.webp",
            rating = 2.2f
        ),
        Recipe(
            id = "18",
            title = "Sloppy Joes",
            ingredients = "2 tablespoons unsalted butter\n" +
                    "\n" +
                    "1 medium onion, diced \n" +
                    "\n" +
                    "1 green bell pepper, diced \n" +
                    "\n" +
                    "1 clove garlic, minced \n" +
                    "\n" +
                    "1 pound lean ground beef \n" +
                    "\n" +
                    "12 ounces (1 1/3 cup) tomato sauce  \n" +
                    "\n" +
                    "3/4 cup ketchup \n" +
                    "\n" +
                    "2 tablespoons brown sugar \n" +
                    "\n" +
                    "2 tablespoons Worcestershire sauce \n" +
                    "\n" +
                    "1 tablespoon yellow mustard \n" +
                    "\n" +
                    "1 tablespoon red wine vinegar \n" +
                    "\n" +
                    "1 teaspoon paprika \n" +
                    "\n" +
                    "Pinch of cayenne pepper \n" +
                    "\n" +
                    "Kosher salt and freshly ground black pepper \n" +
                    "\n" +
                    "6 hamburger buns, toasted \n" +
                    "\n",
            instructions = "Melt the butter in a large skillet over medium-high heat. Add the onions and peppers and cook, stirring occasionally, until softened and starting to caramelize in some spots, 6 to 7 minutes. Add the garlic and cook, stirring, until fragrant, about 1 minute. Stir in the beef and cook, breaking up the meat with a wooden spoon or spatula, until it is browned, no longer pink in the middle and cooked through, 7 to 8 minutes.\n" +
                    "Stir in the tomato sauce, ketchup, brown sugar, Worcestershire sauce, mustard, red wine vinegar, paprika, cayenne pepper, 1 teaspoon salt and a generous amount of black pepper and simmer, stirring occasionally, until thickened and heated through, 5 to 6 minutes. Spoon the meat onto the toasted buns. \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/3/0/FNK_the-best-sloppy-joe_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1567523595923.webp",
            rating = 2.7f
        ),
        Recipe(
            id = "19",
            title = "Roasted Asparagus",
            ingredients = "1 pound thin asparagus, trimmed\n" +
                    "\n" +
                    "3 tablespoons olive oil\n" +
                    "\n" +
                    "Kosher salt and freshly ground black pepper\n" +
                    "\n" +
                    "1 cup freshly grated Parmesan cheese (about 1 1/2 ounces)\n" +
                    "\n" +
                    "1 teaspoon finely grated lemon zest\n" +
                    "\n" +
                    "Juice of 1/4 lemon\n" +
                    "\n",
            instructions = "Preheat the oven to 450 degrees F. Line a baking sheet with a wire rack.\n" +
                    "Put the asparagus, olive oil, 1/2 teaspoon kosher salt and 1/4 teaspoon pepper in a medium bowl. Toss to coat evenly. Spread the asparagus in a single layer on the prepared baking sheet. Roast for 10 to 12 minutes, until lightly browned and tender, but still bright green.\n" +
                    "Meanwhile, spread the Parmesan evenly in the bottom of a medium nonstick skillet over medium heat. Cook undisturbed until the cheese melts, sticks together and turns golden brown, about 2 minutes, then flip with a rubber spatula and cook until golden on the second side, about 2 minutes more. Transfer the frico to a wire rack-lined baking sheet to cool completely, about 2 minutes. Break the frico into small crumbles and put in a small bowl. Add the lemon zest and 1/2 teaspoon black pepper and toss to combine.\n" +
                    "Transfer the roasted asparagus to a serving platter and squeeze the fresh lemon juice over the top. Top with the crumbled frico mixture. \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2020/04/01/0/FNK_The-Best-Roast-Asparagus_s4x3.jpg.rend.hgtvcom.826.620.suffix/1585756493696.webp",
            rating = 3.2f
        ),
        Recipe(
            id = "20",
            title = "Grilled Lobster Tails",
            ingredients = "Olive oil, for brushing\n" +
                    "\n" +
                    "1 stick (8 tablespoons) unsalted butter\n" +
                    "\n" +
                    "2 cloves garlic, very finely chopped or grated\n" +
                    "\n" +
                    "1 teaspoon grated lemon zest plus 2 tablespoons juice\n" +
                    "\n" +
                    "1/4 cup chopped fresh Italian parsley\n" +
                    "\n" +
                    "2 tablespoons chopped fresh chives\n" +
                    "\n" +
                    "Pinch cayenne pepper\n" +
                    "\n" +
                    "Four 8-ounce frozen lobster tails, thawed\n" +
                    "\n" +
                    "Kosher salt\n" +
                    "\n",
            instructions = "If using wooden skewers, soak them in water for 30 minutes before grilling.\n" +
                    "Prepare a grill for medium-high heat and brush the grill grates with oil.\n" +
                    "Melt the butter in a small saucepan over medium-low heat. Add the garlic and cook until sizzling, about 30 seconds. Remove and stir in the lemon zest and juice. Let cool slightly, about 5 minutes, then stir in the parsley, chives and cayenne. Keep warm.\n" +
                    "Using a pair of kitchen shears, cut lengthwise through the top of the lobster shells, then pull the shells apart slightly to expose the lobster meat. Use a knife to cut almost but not completely through the tails and push the cut sides open slightly. Insert a skewer lengthwise through each side of the tails to keep them from curling during grilling. Brush all over with olive oil and sprinkle lightly with salt.\n" +
                    "Grill the tails meat-side down until the shells begin to turn red all over, 4 to 5 minutes. Flip, then brush the meat generously with the butter. Cover with the lid and grill until the meat has just turned white, about 3 minutes. Flip once more, brush again with the butter and grill until the shells are bright red and the meat is just cooked through, about 1 minute more.\n" +
                    "Remove the skewers and serve with any extra warm butter on the side.\n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2023/4/04/FNK_THE_BEST_GRILLED_LOBSTER_TAILS_s4x3.jpg.rend.hgtvcom.826.620.suffix/1680706985817.webp",
            rating = 4.2f
        ),
        Recipe(
            id = "21",
            title = "Baked Mac and Cheese",
            ingredients = "Kosher salt and freshly ground black pepper\n" +
                    "\n" +
                    "1 pound elbow macaroni \n" +
                    "\n" +
                    "Half a loaf day-old French bread  \n" +
                    "\n" +
                    "1 stick (8 tablespoons) unsalted butter  \n" +
                    "\n" +
                    "1/4 cup all-purpose flour \n" +
                    "\n" +
                    "2 teaspoons mustard powder \n" +
                    "\n" +
                    "1/4 teaspoon cayenne  \n" +
                    "\n" +
                    "3 cups milk \n" +
                    "\n" +
                    "8 ounces fontina cheese, grated (about 2 cups) \n" +
                    "\n" +
                    "8 ounces Gruyere, grated (about 2 cups) \n" +
                    "\n" +
                    "1 pound sharp yellow Cheddar, grated (about 4 cups) \n" +
                    "\n",
            instructions = "Preheat the oven to 350 degrees F.\n" +
                    "Bring a large pot of salted water to a boil over high heat. Add the pasta and cook until just slightly softened, about 6 minutes. Reserve 1 cup pasta cooking water, then drain the pasta and rinse under cold water. \n" +
                    "Meanwhile, remove the crusts from the bread and cut into 1-inch cubes. Pulse in the food processor until the bread breaks into bean-sized pieces. \n" +
                    "Melt 3 tablespoons of the butter in a large skillet over medium heat. Add the breadcrumbs and cook, stirring, until toasted, 5 to 10 minutes. Remove from the heat and season with salt and pepper. \n" +
                    "Melt 4 tablespoons of the butter in a large saucepan over medium heat. Whisk in the flour, mustard powder and cayenne. Cook, whisking constantly, until smooth and slightly golden, about 2 minutes. Whisk in the milk and cook, whisking occasionally, until the sauce begins to boil and thicken, about 7 minutes, then remove from heat. Stir in the fontina, Gruyere and all but 1 1/2 cups of the Cheddar until fully melted. Stir in the pasta, adding the reserved pasta water as needed to make a creamy sauce. Season with salt and pepper. \n" +
                    "Melt the remaining 1 tablespoon butter in a small bowl in the microwave. Brush a 9-by-13-inch glass or ceramic baking dish with the melted butter. Spread the pasta mixture in the prepared dish. Sprinkle the remaining Cheddar evenly over the pasta, then scatter the toasted breadcrumbs on top. Bake until heated through and just bubbling, about 25 minutes. Let rest for 10 minutes before serving.  \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/9/9/0/FNK_the-best-baked-mac-and-cheese_H.JPG.rend.hgtvcom.826.620.suffix/1568132194727.webp",
            rating = 3.8f
        ),
        Recipe(
            id = "22",
            title = "Fudgy Brownies",
            ingredients = "Nonstick baking spray\n" +
                    "\n" +
                    "3 sticks (1 1/2 cups) unsalted butter \n" +
                    "\n" +
                    "6 ounces bittersweet chocolate (64-percent cacao), chopped \n" +
                    "\n" +
                    "1/4 cup heavy cream \n" +
                    "\n" +
                    "1 cup all-purpose flour (see Cook's Note) \n" +
                    "\n" +
                    "1 1/4 cups Dutch-process cocoa \n" +
                    "\n" +
                    "1 3/4 cups granulated sugar \n" +
                    "\n" +
                    "1/2 cup packed dark brown sugar \n" +
                    "\n" +
                    "1 3/4 teaspoons kosher salt \n" +
                    "\n" +
                    "1 tablespoon pure vanilla paste or extract \n" +
                    "\n" +
                    "2 teaspoons instant espresso powder  \n" +
                    "\n" +
                    "6 large eggs, chilled \n" +
                    "\n",
            instructions = "Arrange a rack in the center of the oven and preheat to 350 degrees F. Spray a 13-by-9-inch baking pan, preferably metal, with nonstick baking spray. Line the pan with parchment paper leaving a 2-inch overhang on the longer sides. Lightly coat with nonstick spray.\n" +
                    "Melt the butter in a large saucepan over medium heat, swirling occasionally, until the butter is a deep golden color, about 5 minutes; the butter will hiss and spit as the whey evaporates so be careful. As the foam subsides the butter will go from a canary yellow color to golden. When it does, take it off the heat. Add the chocolate and cream to the butter and let it sit, stirring occasionally, until the chocolate is melted.  \n" +
                    "Sift the flour and cocoa powder through a fine-mesh sieve into a medium bowl. Beat the granulated sugar, brown sugar, salt, vanilla, espresso powder and eggs in the bowl of a stand mixer fitted with the whisk attachment. Start on low speed and gradually increase to high speed until the eggs are pale, very thick and fluffy, about 8 minutes (start your timer when you get to high speed). Do not be tempted to skimp on the mix time; this step is key to getting the signature shiny, crackled brownie top. Reduce the speed to low and slowly pour the warm chocolate into the eggs; beat until completely incorporated. Gradually add the dry ingredients and beat until just combined; do not overmix. Use a rubber spatula to scrape the sides and bottom of the bowl and fold until the batter is completely combined.  \n" +
                    "Scrape the batter into the prepared pan. Bake until the brownies are glossy and just barely firm, and an instant-read thermometer inserted into the center registers 205 degrees F, 25 to 35 minutes. Don't let the thermometer touch the bottom of the pan or you will get a much higher reading. (The cook time will be at the higher end of the range if using a glass or ceramic baking dish.) \n" +
                    "Let the brownies cool completely to allow the crumb to set before slicing, about 3 hours.  \n" +
                    "Use an offset spatula to loosen the brownies from the sides of the pan. Use the parchment overhang to lift the brownies out of the pan. Remove the parchment and cut into 24 squares. \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/7/11/0/FNK_the-best-fried-chicken_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1562853883458.webp",
            rating = 4.2f
        ),
        Recipe(
            id = "23",
            title = "Garlic Bread",
            ingredients = "1 1/2 sticks (12 tablespoons) unsalted butter\n" +
                    "\n" +
                    "4 cloves garlic, finely chopped \n" +
                    "\n" +
                    "1 large soft Italian or French loaf \n" +
                    "\n" +
                    "1/4 cup grated Parmesan \n" +
                    "\n" +
                    "Kosher salt \n" +
                    "\n" +
                    "2 tablespoons flat-leaf parsley leaves, finely chopped \n" +
                    "\n",
            instructions = "Arrange a rack in the center of oven and preheat to 450 degrees F.\n" +
                    "Melt the butter in a small skillet over medium heat. Add the garlic and cook, stirring occasionally, until the butter is golden and the garlic is very fragrant, about 3 minutes.  \n" +
                    "Slice the bread in half lengthwise. Liberally brush the crust with the garlic butter. Turn the bread cut-side up. Slice each loaf crosswise at 2-inch intervals without cutting all the way through, making \"pull-apart\" garlic bread. Liberally brush the cut sides of the bread with more garlic butter, spreading any remaining garlic evenly over top. You should use all the garlic butter. Carefully transfer the bread to a rimmed baking sheet.  \n" +
                    "Sprinkle the loaves with the Parmesan and a pinch of salt and bake until the edges of the bread are a deep golden brown, 10 to 15 minutes. Top with the parsley. Serve warm. \n",
            imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/7/11/0/FNK_the-best-garlic-bread_H_s4x3.jpg.rend.hgtvcom.826.620.suffix/1562853902494.webp",
            rating = 5.0f
        )*/
    )
}