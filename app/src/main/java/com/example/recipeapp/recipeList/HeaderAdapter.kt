package com.example.recipeapp.recipeList

import com.example.recipeapp.R

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/* A list always displaying one element: the number of recipes. */

class HeaderAdapter: RecyclerView.Adapter<HeaderAdapter.HeaderViewHolder>() {
    private var recipeCount: Int = 0

    /* ViewHolder for displaying header. */
    class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val recipeNumberTextView: TextView = itemView.findViewById(R.id.recipe_number_text)

        fun bind(recipeCount: Int) {
            recipeNumberTextView.text = recipeCount.toString()
        }
    }

    /* Inflates view and returns HeaderViewHolder. */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeaderViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.header_item, parent, false)
        return HeaderViewHolder(view)
    }

    /* Binds number of recipes to the header. */
    override fun onBindViewHolder(holder: HeaderViewHolder, position: Int) {
        holder.bind(recipeCount)
    }

    /* Returns number of items, since there is only one item in the header return one  */
    override fun getItemCount(): Int {
        return 1
    }

    /* Updates header to display number of recipes when a recipe is added or subtracted. */
    fun updateRecipeCount(updatedRecipeCount: Int) {
        recipeCount = updatedRecipeCount
        notifyDataSetChanged()
    }
}