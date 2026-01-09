package com.example.kotlin.sports_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.R

class SportsAppAdapter(private val sports:List<SportModel>)
    :RecyclerView.Adapter<SportsAppAdapter.ViewHolder>(){
        inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
            var imageView: ImageView
            var title: TextView
            init {
                imageView = view.findViewById(R.id.sportsCardImageView)
                title = view.findViewById(R.id.sportsCardTextView)
                view.setOnClickListener{
                    Toast.makeText(
                        view.context,
                        "you clicked ${sports[adapterPosition].title}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.sports_card_item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return sports.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = sports[position]
        holder.imageView.setImageResource(item.image)
        holder.title.text = item.title
    }
}