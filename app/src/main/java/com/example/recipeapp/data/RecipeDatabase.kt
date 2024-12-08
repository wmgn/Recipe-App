package com.example.recipeapp.data

import android.content.Context
import android.content.res.Resources
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [Recipe::class], version = 1, exportSchema = false)
abstract class RecipeDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao

    companion object {
        @Volatile
        private var INSTANCE: RecipeDatabase? = null

        fun getDatabase(context: Context): RecipeDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RecipeDatabase::class.java,
                    "recipe_database"
                )
                    .addCallback(RecipeDatabaseCallback(context))
                    .build()
                INSTANCE = instance
                instance
            }
        }

        private class RecipeDatabaseCallback(
            private val context: Context
        ) : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                // Populate the database in the background.
                CoroutineScope(Dispatchers.IO).launch {
                    populateDatabase(getDatabase(context).recipeDao())
                }
            }
        }

        suspend fun populateDatabase(recipeDao: RecipeDao) {
            // Fetch the initial recipe list and insert them into the database
            val initialRecipes = recipeList()
            recipeDao.insertAllRecipes(initialRecipes)
        }


    }
}
