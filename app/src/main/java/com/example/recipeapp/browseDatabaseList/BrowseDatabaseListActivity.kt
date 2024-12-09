package com.example.recipeapp.browseDatabaseList

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.recipeDetail.RecipeDetailActivity
import com.example.recipeapp.R
import com.example.recipeapp.addRecipe.RECIPE_TITLE
import com.example.recipeapp.addRecipe.RECIPE_INGREDIENTS
import com.example.recipeapp.addRecipe.RECIPE_INSTRUCTIONS
import com.example.recipeapp.addRecipe.RECIPE_IMAGEURL
import com.example.recipeapp.data.Recipe
import com.example.recipeapp.recipeList.HeaderAdapter
import com.example.recipeapp.recipeList.RecipesAdapter
import com.example.recipeapp.recipeList.RecipesListViewModel
import com.example.recipeapp.recipeList.RecipesListViewModelFactory

const val RECIPE_ID = "recipe id"

class BrowseDatabaseListActivity : AppCompatActivity() {
    private val newRecipeActivityRequestCode = 1
    private val browseDatabaseListViewModel by viewModels<BrowseDatabaseListViewModel> {
        BrowseDatabaseListViewModelFactory(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.browse_database_list_activity)

        /* Instantiates headerAdapter and recipesAdapter. Both adapters are added to concatAdapter.
        which displays the contents sequentially */
        val headerAdapter = HeaderAdapter()
        val recipesAdapter = RecipesAdapter { recipe -> adapterOnClick(recipe) }
        val concatAdapter = ConcatAdapter(headerAdapter, recipesAdapter)
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = concatAdapter

        // TODO need to replace this with firebase stuff
        browseDatabaseListViewModel.recipesLiveData.observe(this, {
            it?.let {
                recipesAdapter.submitList(it as MutableList<Recipe>)
                headerAdapter.updateRecipeCount(it.size)
            }
        })

        val load_more_button: View = findViewById(R.id.load_more_button)
        load_more_button.setOnClickListener {
            load_more_buttonOnClick()
        }
    }

    /* Opens RecipeDetailActivity when RecyclerView item is clicked. */
    // TODO need to rewrite this, maybe still use RecipeDetailActivity, let it somehow access firebase? not sure
    // might need to write new browseDatabaseDetail package
    private fun adapterOnClick(recipe: Recipe) {
        //Log.w("Troubleshooting1", "adapterOnClick, recipe: " + recipe + "\ntoString: " + recipe.title.toString())
        val intent = Intent(this, RecipeDetailActivity()::class.java)
        intent.putExtra(RECIPE_ID, recipe.id)
        //Log.w("Troubleshooting1", "RECIPE_ID: " + RECIPE_ID + "recipe.id" + recipe.id)
        //Log.w("Troubleshooting1", "extras" + intent.extras)
        startActivity(intent)
    }

    /* fetches more recipes from firebase database, to display. */
    private fun load_more_buttonOnClick() {
        //val intent = Intent(this, AddRecipeActivity::class.java)
        //startActivityForResult(intent, newRecipeActivityRequestCode)
        // TODO need to write code to fetch more recipes from firebase database here

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intentData: Intent?) {
        super.onActivityResult(requestCode, resultCode, intentData)

        /* Inserts recipe into viewModel. */
        if (requestCode == newRecipeActivityRequestCode && resultCode == Activity.RESULT_OK) {
            intentData?.let { data ->
                val recipeTitle = data.getStringExtra(RECIPE_TITLE)
                val recipeIngredients = data.getStringExtra(RECIPE_INGREDIENTS)
                val recipeInstructions = data.getStringExtra(RECIPE_INSTRUCTIONS)
                val recipeImageURL = data.getStringExtra(RECIPE_IMAGEURL)

                browseDatabaseListViewModel.insertRecipe(recipeTitle, recipeIngredients, recipeInstructions, recipeImageURL)
            }
        }
    }
}