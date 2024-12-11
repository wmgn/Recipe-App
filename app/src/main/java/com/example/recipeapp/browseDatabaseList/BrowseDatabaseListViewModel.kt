package com.example.recipeapp.browseDatabaseList

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recipeapp.data.Recipe
import com.example.recipeapp.recipeList.RecipesAdapter
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.random.Random

class BrowseDatabaseListViewModel : ViewModel() { //(val dataSource: DataSource)

    private val firebase = FirebaseDatabase.getInstance().getReference("recipes")

    // LiveData to hold the recipes fetched from Firebase
    private val _recipesLiveData = MutableLiveData<List<Recipe>>()
    val recipesLiveData: LiveData<List<Recipe>> get() = _recipesLiveData

    // Internal list to track loaded recipes
    private val recipes = mutableListOf<Recipe>()

    // Keep track of the last key for pagination
    private var lastKey: String? = null
    private var isLoading = false

    init {
        //fetchRecipesFromFirebase()
        //fetchRecipes(1, recipesAdapter)
    }

    /*private fun fetchRecipesFromFirebase() { //old method, works sorta
        firebase.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val recipes = mutableListOf<Recipe>()
                for (child in snapshot.children) {
                    val recipe = child.getValue(Recipe::class.java)
                    recipe?.let { recipes.add(it) }
                }
                _recipesLiveData.value = recipes
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w("Firebase", "Failed to read value.", error.toException())
            }
        })
    }*/

    // Fetch a given number of recipes starting from the last key
    fun fetchRecipes(count: Int, recipesAdapter: RecipesAdapter) {
        Log.w("Firebase", "fetchRecipes(count: $count) called")
        if (isLoading) {
            Log.w("Firebase", "Fetch already in progress. Skipping...")
            return // Prevent multiple simultaneous fetches
        }
        isLoading = true
        Log.w("Firebase", "Starting to fetch $count recipes. Last key: $lastKey")

        var query = firebase.orderByKey().limitToFirst(count)
        lastKey?.let {
            Log.w("Firebase", "Querying recipes starting after key: $it")
            query = firebase.orderByKey().startAfter(it).limitToFirst(count)
        }

        query.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                Log.w("Firebase", "Data retrieved successfully. Snapshot size: ${snapshot.childrenCount}")
                if (snapshot.childrenCount == 0L) {
                    Log.w("Firebase", "No more recipes to fetch. Ending pagination.")
                    isLoading = false
                    return
                }

                val newRecipes = mutableListOf<Recipe>()
                for (child in snapshot.children) {
                    val recipe = child.getValue(Recipe::class.java)
                    Log.w("Firebase", "recipe: $recipe")
                    recipe?.let { newRecipes.add(it) }
                    lastKey = child.key // Update the last key
                }
                recipes.addAll(newRecipes) // Append to the list
                _recipesLiveData.value = recipes // Update LiveData
                recipesAdapter.notifyDataSetChanged()
                Log.w("Firebase", "Recipes LiveData updated. Total recipes: ${recipes.size}")
                isLoading = false
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w("Firebase", "Failed to load recipes: ${error.message}", error.toException())
                isLoading = false
            }
        })
    }


    // TODO this datasource needs to be replaced with firebase somehow
    //val recipesLiveData = dataSource.getRecipeList() //old

    /* If the name and description are present, create new Recipe and add it to the datasource */
    fun insertRecipe(recipeTitle: String?, recipeIngredients: String?, recipeInstructions: String?, recipeImageUrl: String?) {
        if (recipeTitle == null || recipeIngredients == null || recipeInstructions == null || recipeImageUrl == null) {
            return
        }

        //val image = dataSource.getRandomRecipeImageAsset()
        val newRecipe = Recipe(
            Random.nextLong().toString(), // id, as a string
            recipeTitle,
            recipeIngredients,
            recipeInstructions,
            recipeImageUrl,
            0.0f
        )

        CoroutineScope(Dispatchers.IO).launch {
            //dataSource.addRecipe(newRecipe)
        }
    }
}

class BrowseDatabaseListViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BrowseDatabaseListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return BrowseDatabaseListViewModel(
                //dataSource = DataSource.getDataSource(context)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}