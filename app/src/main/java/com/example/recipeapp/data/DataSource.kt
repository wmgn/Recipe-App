package com.example.recipeapp.data

import android.content.Context
import android.content.res.Resources
import androidx.lifecycle.LiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DataSource(context: Context) {

    // Get the Recipe DAO instance
    private val recipeDao = RecipeDatabase.getDatabase(context).recipeDao()

    /**
     * Adds a recipe to the database.
     * If the recipe already exists (based on the same ID), it will be replaced.
     */
    suspend fun addRecipe(recipe: Recipe) {
        withContext(Dispatchers.IO) {
            recipeDao.insertRecipe(recipe)
        }
    }

    /**
     * Removes a recipe from the database.
     */
    suspend fun removeRecipe(recipe: Recipe) {
        withContext(Dispatchers.IO) {
            recipeDao.deleteRecipe(recipe)
        }
    }

    /**
     * Publishes a recipe from the Room database to the Firebase database.
     */
    suspend fun publishRecipe(recipe: Recipe) {
        // TODO write this function to do what it is supposed to do
        // TODO not sure if this needs to be here actually
        //withContext(Dispatchers.IO) {
        //    recipeDao.deleteRecipe(recipe)
        //}
    }

    /**
     * Fetches a recipe by its ID.
     */
    suspend fun getRecipeForId(id: String): Recipe? {
        return withContext(Dispatchers.IO) {
            recipeDao.getRecipeById(id)
        }
    }

    /**
     * Returns the list of recipes as LiveData, so changes are observed in real-time.
     */
    fun getRecipeList(): LiveData<List<Recipe>> {
        return recipeDao.getAllRecipes()
    }


    companion object {
        private var INSTANCE: DataSource? = null

        fun getDataSource(context: Context): DataSource { //Resources?
            return synchronized(DataSource::class) {
                val newInstance = INSTANCE ?: DataSource(context)
                INSTANCE = newInstance
                newInstance
            }
        }
    }

}