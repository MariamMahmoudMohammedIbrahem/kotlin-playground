package com.example.kotlin.grocery_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.R

class GroceryAppAdapter (private val groceries : ArrayList<Grocery>, private val onItemClick: (Grocery) -> Unit)
    :RecyclerView.Adapter<GroceryAppAdapter.ViewHolder>(){
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var imageView: ImageView
        var titleTextView: TextView
        var subtitleTextView: TextView
        init {
            imageView = view.findViewById(R.id.groceryImageView)
            titleTextView = view.findViewById(R.id.groceryTitleTextView)
            subtitleTextView = view.findViewById(R.id.grocerySubTitleTextView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // called by recycler view when we needs a new VH instance
        // inflating the layout for a single item and returning a new VH
        // viewGroup: is the parent view that the new view will be attached to
        //            after it is bound to its data
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.grocery_recycle_view_item_layout, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return groceries.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = groceries[position]

        // bind data to a view holder at a specific position
        holder.titleTextView.text = groceries[position].title
        holder.subtitleTextView.text = groceries[position].subtitle
        holder.imageView.setImageResource(groceries[position].image)

        holder.itemView.setOnClickListener {
            onItemClick(item)
        }
    }
}