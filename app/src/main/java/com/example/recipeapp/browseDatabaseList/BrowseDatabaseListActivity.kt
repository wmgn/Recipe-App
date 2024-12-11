package com.example.recipeapp.browseDatabaseList

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.recipeDetail.RecipeDetailActivity
import com.example.recipeapp.R
import com.example.recipeapp.addRecipe.RECIPE_TITLE
import com.example.recipeapp.addRecipe.RECIPE_INGREDIENTS
import com.example.recipeapp.addRecipe.RECIPE_INSTRUCTIONS
import com.example.recipeapp.addRecipe.RECIPE_IMAGEURL
import com.example.recipeapp.data.Recipe
import com.example.recipeapp.recipeList.RecipesAdapter
import com.google.firebase.database.FirebaseDatabase

const val RECIPE_ID = "recipe id"

class BrowseDatabaseListActivity : AppCompatActivity() {
    private val newRecipeActivityRequestCode = 1
    private val browseDatabaseListViewModel by viewModels<BrowseDatabaseListViewModel> {
        BrowseDatabaseListViewModelFactory(this)
    }

    private lateinit var recipeAdapter: RecipesAdapter
    private val recipes = mutableListOf<Recipe>()
    private val firebase = FirebaseDatabase.getInstance().reference.child("recipes")
    // and FirebaseReference classes, along with ValueEventListener interface

    //val recipesLiveData = dataSource.getRecipeList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.browse_database_list_activity)

        /* Instantiates headerAdapter and recipesAdapter. Both adapters are added to concatAdapter.
        which displays the contents sequentially */ // not done this way anymore
        //val headerAdapter = HeaderAdapter()
        //val concatAdapter = ConcatAdapter(headerAdapter, recipesAdapter)
        val recipesAdapter = RecipesAdapter { recipe -> adapterOnClick(recipe) }
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        //recyclerView.adapter = concatAdapter
        recyclerView.adapter = recipesAdapter

        browseDatabaseListViewModel.fetchRecipes(3, recipesAdapter) // TODO fetchRecipes possible implementation


        // TODO need to replace this with firebase stuff
        browseDatabaseListViewModel.recipesLiveData.observe(this) { recipes ->
            recipes?.let {
                recipesAdapter.submitList(it as MutableList<Recipe>)
                //headerAdapter.updateRecipeCount(it.size)
            }
        }

        val loadMoreButton: View = findViewById(R.id.load_more_button)
        loadMoreButton.setOnClickListener {
            //load_more_buttonOnClick()
            browseDatabaseListViewModel.fetchRecipes(3, recipesAdapter) // TODO fetchRecipes possible implementation
        }
    }


    /* Opens RecipeDetailActivity when RecyclerView item is clicked. */
    // TODO need to rewrite this, maybe still use RecipeDetailActivity, let it somehow access firebase? not sure
    // might need to write new browseDatabaseDetail package
    private fun adapterOnClick(recipe: Recipe) {
        val intent = Intent(this, RecipeDetailActivity()::class.java)
        intent.putExtra(RECIPE_ID, recipe.id)
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

                browseDatabaseListViewModel.insertRecipe(recipeTitle, recipeIngredients, recipeInstructions, recipeImageURL)
            }
        }
    }
}