package com.example.recipeapp.recipeDetail

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recipeapp.data.DataSource
import com.example.recipeapp.data.Recipe

class RecipeDetailViewModel(private val datasource: DataSource) : ViewModel() {

    /* Queries datasource to returns a recipe that corresponds to an id. */
    fun getRecipeForId(id: String) : Recipe? {
        return datasource.getRecipeForId(id)
    }

    /* Queries datasource to remove a recipe. */
    fun removeRecipe(recipe: Recipe) {
        datasource.removeRecipe(recipe)
    }
}

class RecipeDetailViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RecipeDetailViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RecipeDetailViewModel(
                datasource = DataSource.getDataSource(context.resources)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}