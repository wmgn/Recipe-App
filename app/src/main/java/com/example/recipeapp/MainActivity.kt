package com.example.recipeapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.recipeList.RecipesAdapter

// currently not used at all in app
// currently not used at all in app
// currently not used at all in app

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //enableEdgeToEdge()
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
        //    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        //    insets
        //}


        val dataset = arrayOf("Spaghetti", "Pizza", "Omelette", "Roast Turkey")
        // ^ replace with Firebase dataset
        //val recipesAdapter = RecipesAdapter(dataset) //needs fix

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        //recyclerView.adapter = recipesAdapter

        // Floating Action Button (fab)
        val fab: Button = findViewById(R.id.fab)
        fab.setOnClickListener { handleFabClick() } //"red"


    }

    private fun handleFabClick() {
        TODO("Not yet implemented")
    }
}