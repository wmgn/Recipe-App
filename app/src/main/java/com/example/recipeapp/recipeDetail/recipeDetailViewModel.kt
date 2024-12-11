package com.example.recipeapp.recipeDetail

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.recipeapp.data.DataSource
import com.example.recipeapp.data.Recipe
import com.google.firebase.database.FirebaseDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import kotlinx.coroutines.withContext

class RecipeDetailViewModel(private val datasource: DataSource) : ViewModel() {

    /* Queries datasource to returns a recipe that corresponds to an id. */
    private val _recipe = MutableLiveData<Recipe?>()
    val recipe: LiveData<Recipe?> get() = _recipe // this variable gets observed

    private val _storedOnLocal = MutableLiveData<Boolean?>()
    val storedOnLocal: LiveData<Boolean?> get() = _storedOnLocal

    fun fetchRecipeById(id: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val localRecipe  = datasource.getRecipeForId(id)

            if (localRecipe != null) {
                // Recipe found locally, update LiveData
                withContext(Dispatchers.Main) {
                    _recipe.value = localRecipe
                    _storedOnLocal.value = true
                }
            } else {
                // Recipe not found locally, fetch from Firebase
                val remoteRecipe = fetchFromFirebase(id)
                withContext(Dispatchers.Main) {
                    _recipe.value = remoteRecipe
                    _storedOnLocal.value = false
                }
            }
        }
    }

    private suspend fun fetchFromFirebase(id: String): Recipe? {
        Log.w("RecipeDetailViewModel", "fetchFromFirebase id: $id")
        return try {
            val firebase = FirebaseDatabase.getInstance()
            val recipesRef = firebase.getReference("recipes")
            val snapshot = recipesRef.child(id).get().await()
            snapshot.getValue(Recipe::class.java) // Parse Firebase data into a Recipe object
        } catch (e: Exception) {
            Log.w("RecipeDetailViewModel", "Error fetching recipe from Firebase: ${e.message}")
            null // Return null if there was an error
        }
    }


    /* Queries datasource to remove a recipe. */
    fun removeRecipe(recipeToRemove: Recipe) {
        CoroutineScope(Dispatchers.IO).launch {
            datasource.removeRecipe(recipeToRemove)
        }
        //_storedOnLocal.value = false //dont need this, remove calls finish() anyway
    }

    fun publishRecipe(context: Context) {
        // Retrieve the current recipe value from LiveData
        val currentRecipe = recipe.value

        if (currentRecipe != null) {
            // Upload recipe to Firebase
            val firebase = FirebaseDatabase.getInstance()
            val recipesRef = firebase.getReference("recipes")
            recipesRef.child(currentRecipe.id).setValue(currentRecipe)
                .addOnSuccessListener {
                    Toast.makeText(context, "Recipe published.", Toast.LENGTH_SHORT).show()
                }
                .addOnFailureListener {
                    Toast.makeText(context, "Failed to publish recipe.", Toast.LENGTH_SHORT).show()
                }
        } else {
            // Handle the case where the recipe is null
            Toast.makeText(context, "No recipe to publish.", Toast.LENGTH_SHORT).show()
        }
    }

    fun saveRecipeToLocal(context: Context) {
        val currentRecipe = recipe.value

        if (currentRecipe != null) {
            CoroutineScope(Dispatchers.IO).launch {
                try {
                    datasource.addRecipe(currentRecipe) // Save recipe to local database
                    withContext(Dispatchers.Main) {
                        Toast.makeText(context, "Recipe saved locally.", Toast.LENGTH_SHORT).show()
                        _storedOnLocal.value = true // Update the local state flag
                    }
                } catch (e: Exception) {
                    withContext(Dispatchers.Main) {
                        Toast.makeText(context, "Failed to save recipe: ${e.message}", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        } else {
            Toast.makeText(context, "No recipe to save.", Toast.LENGTH_SHORT).show()
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