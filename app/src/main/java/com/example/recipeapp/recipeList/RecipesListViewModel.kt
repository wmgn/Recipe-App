package com.example.recipeapp.recipeList

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recipeapp.data.DataSource
import com.example.recipeapp.data.Recipe
import kotlin.random.Random

class RecipesListViewModel(val dataSource: DataSource) : ViewModel() {

    val recipesLiveData = dataSource.getRecipeList()

    /* If the name and description are present, create new Recipe and add it to the datasource */
    fun insertRecipe(recipeTitle: String?, recipeIngredients: String?, recipeInstructions: String?, recipeImageUrl: String?) {
        if (recipeTitle == null || recipeIngredients == null || recipeInstructions == null || recipeImageUrl == null) {
            return
        }

        val image = dataSource.getRandomRecipeImageAsset()
        val newRecipe = Recipe(
            Random.nextLong().toString(), // id, as a string
            recipeTitle,
            recipeIngredients,
            recipeInstructions,
            recipeImageUrl,
            0.0f
        )

        dataSource.addRecipe(newRecipe)
    }
}

class RecipesListViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RecipesListViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RecipesListViewModel(
                dataSource = DataSource.getDataSource(context.resources)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}