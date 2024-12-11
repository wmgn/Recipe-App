package com.example.recipeapp.recipeList

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.addRecipe.AddRecipeActivity
import com.example.recipeapp.recipeDetail.RecipeDetailActivity
import com.example.recipeapp.R
import com.example.recipeapp.addRecipe.RECIPE_TITLE
import com.example.recipeapp.addRecipe.RECIPE_INGREDIENTS
import com.example.recipeapp.addRecipe.RECIPE_INSTRUCTIONS
import com.example.recipeapp.addRecipe.RECIPE_IMAGEURL
import com.example.recipeapp.browseDatabaseList.BrowseDatabaseListActivity
import com.example.recipeapp.data.Recipe

const val RECIPE_ID = "recipe id"

class RecipesListActivity : AppCompatActivity() {
    private val newRecipeActivityRequestCode = 1
    private val recipesListViewModel by viewModels<RecipesListViewModel> {
        RecipesListViewModelFactory(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Instantiates headerAdapter and recipesAdapter. Both adapters are added to concatAdapter.
        which displays the contents sequentially */
        val headerAdapter = HeaderAdapter()
        val recipesAdapter = RecipesAdapter { recipe -> adapterOnClick(recipe) }
        val concatAdapter = ConcatAdapter(headerAdapter, recipesAdapter)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = concatAdapter

        recipesListViewModel.recipesLiveData.observe(this, {
            it?.let {
                recipesAdapter.submitList(it as MutableList<Recipe>)
                headerAdapter.updateRecipeCount(it.size)
            }
        })

        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener {
            fabOnClick()
        }
        val fabBrowseDatabase: View = findViewById(R.id.fab_browse_database)
        fabBrowseDatabase.setOnClickListener {
            fabBrowseDatabaseOnClick()
        }
    }

    /* Opens RecipeDetailActivity when RecyclerView item is clicked. */
    private fun adapterOnClick(recipe: Recipe) {
        //Log.w("Troubleshooting1", "adapterOnClick, recipe: " + recipe + "\ntoString: " + recipe.title.toString())
        val intent = Intent(this, RecipeDetailActivity()::class.java)
        intent.putExtra(RECIPE_ID, recipe.id)
        //Log.w("Troubleshooting1", "RECIPE_ID: " + RECIPE_ID + "recipe.id" + recipe.id)
        //Log.w("Troubleshooting1", "extras" + intent.extras)
        startActivity(intent)
    }

    /* Adds recipe to recipeList when FAB is clicked. */
    private fun fabOnClick() {
        val intent = Intent(this, AddRecipeActivity::class.java)
        startActivityForResult(intent, newRecipeActivityRequestCode)
    }

    /* Adds recipe to recipeList when FAB is clicked. */
    private fun fabBrowseDatabaseOnClick() {
        // TODO needs to go to BrowseDatabaseListActivity
        // Create an Intent to open the BrowseDatabaseListActivity
        val intent = Intent(this, BrowseDatabaseListActivity::class.java)

        // Start the activity
        startActivity(intent)
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

                recipesListViewModel.insertRecipe(recipeTitle, recipeIngredients, recipeInstructions, recipeImageURL)
            }
        }
    }
}