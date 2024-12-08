package com.example.recipeapp.data

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/* Handles operations on recipesLiveData and holds details about it. */
class DataSource(resources: Resources) {
    private val initialRecipeList = recipeList(resources)
    private val recipesLiveData = MutableLiveData(initialRecipeList)

    /* Adds recipe to liveData and posts value. */
    fun addRecipe(recipe: Recipe) {
        val currentList = recipesLiveData.value
        if (currentList == null) {
            recipesLiveData.postValue(listOf(recipe))
        } else {
            val updatedList = currentList.toMutableList()
            updatedList.add(0, recipe)
            recipesLiveData.postValue(updatedList)
        }
    }

    /* Removes recipe from liveData and posts value. */
    fun removeRecipe(recipe: Recipe) {
        val currentList = recipesLiveData.value
        if (currentList != null) {
            val updatedList = currentList.toMutableList()
            updatedList.remove(recipe)
            recipesLiveData.postValue(updatedList)
        }
    }

    /* Returns recipe given an ID. */
    fun getRecipeForId(id: String): Recipe? {
        recipesLiveData.value?.let { recipes ->
            return recipes.firstOrNull{ it.id == id}
        }
        return null
    }

    fun getRecipeList(): LiveData<List<Recipe>> {
        return recipesLiveData
    }

    /* Returns a random recipe asset for recipes that are added. */
    fun getRandomRecipeImageAsset(): Int? {
        val randomNumber = (initialRecipeList.indices).random()
        //return initialRecipeList[randomNumber].image
        return 0
    }

    companion object {
        private var INSTANCE: DataSource? = null

        fun getDataSource(resources: Resources): DataSource {
            return synchronized(DataSource::class) {
                val newInstance = INSTANCE ?: DataSource(resources)
                INSTANCE = newInstance
                newInstance
            }
        }
    }
}