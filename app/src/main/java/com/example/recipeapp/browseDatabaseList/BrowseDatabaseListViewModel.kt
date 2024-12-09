package com.example.recipeapp.browseDatabaseList

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recipeapp.data.DataSource
import com.example.recipeapp.data.Recipe
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.random.Random

class BrowseDatabaseListViewModel(val dataSource: DataSource) : ViewModel() {

    // TODO this datasource needs to be replaced with firebase somehow
    val recipesLiveData = dataSource.getRecipeList()

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
            dataSource.addRecipe(newRecipe)
        }
    }
}

class BrowseDatabaseListViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BrowseDatabaseListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return BrowseDatabaseListViewModel(
                dataSource = DataSource.getDataSource(context)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}