package com.example.kotlin.volume_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.kotlin.R

class VolumeAppAdapter (private val context: Context, private val shapes: List<Shape>)
    : ArrayAdapter<Shape>(context, 0, shapes) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view = convertView
        val holder : ViewHolder

        if(convertView == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.grid_item_layout, parent, false)

            holder = ViewHolder()
            holder.imageView = view.findViewById(R.id.imageView)
            holder.textView = view.findViewById(R.id.titleTextView)

            view.tag = holder
        } else {
            holder = view?.tag as ViewHolder
        }
        val currentItem = shapes[position]
        holder.imageView.setImageResource(currentItem.image)
        holder.textView.text = currentItem.title
        return view!!
    }

        class ViewHolder {
            lateinit var imageView: ImageView
            lateinit var textView: TextView
        }
    }