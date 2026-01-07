package com.example.kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CustomAdapter(private val context: Context, private val items:List<String>): BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //convert view is a recycle view when a view goes off screen instead of destroying it
        // android provides this view to be reused for the next item that comes on screen
        // if the convert view is null a new view needs to be inflated
        // parent is a view group indicating that this view will eventually be attached to
        // often used in the layout inflation process to determine the layout parameters
        val inflater = context.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view:View = convertView
            ?: inflater.inflate(
                R.layout.custom_layout,
                parent,
                false
            )
        val item = getItem(position) as String
//        val title = view.findViewById<TextView>(R.id.customTextView)
//        title.text = item

        return view
    }
}