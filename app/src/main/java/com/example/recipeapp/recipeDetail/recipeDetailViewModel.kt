package com.example.recipeapp.recipeDetail

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recipeapp.data.DataSource
import com.example.recipeapp.data.Recipe
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RecipeDetailViewModel(private val datasource: DataSource) : ViewModel() {

    /* Queries datasource to returns a recipe that corresponds to an id. */
    private val _recipe = MutableLiveData<Recipe?>()
    val recipe: LiveData<Recipe?> get() = _recipe

    fun fetchRecipeById(id: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val fetchedRecipe = datasource.getRecipeForId(id)
            withContext(Dispatchers.Main) {
                _recipe.value = fetchedRecipe
            }
        }
    }

    /* Queries datasource to remove a recipe. */
    fun removeRecipe(recipeToRemove: Recipe) {
        CoroutineScope(Dispatchers.IO).launch {
            datasource.removeRecipe(recipeToRemove)
        }
    }

    /* Publishes/Uploads recipe to Firebase database */
    fun publishRecipe(recipeToPublish: Recipe) {
        CoroutineScope(Dispatchers.IO).launch {
            // TODO write this function to do what its supposed to do
            // TODO might not need to use datasource., maybe can just talk to/access firebase right here in the ViewModel, not sure.
            //datasource.publishRecipe(recipeToPublish)
        }
    }
}

class RecipeDetailViewModelFactory(private val context: Context) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RecipeDetailViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return RecipeDetailViewModel(
                datasource = DataSource.getDataSource(context)
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}