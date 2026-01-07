package com.example.kotlin.planets_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.kotlin.R

class PlanetsAppAdapter(private val context: Context, private val planets: List<Planets>) : BaseAdapter() {
    override fun getCount(): Int {
        return planets.size
    }

    override fun getItem(position: Int): Any {
        return planets[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val view: View
        if(convertView == null) {
            val inflater = context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.grid_item_layout, parent, false)

        } else {
            view = convertView
        }

        val planetText = view.findViewById<TextView>(R.id.planetName)
        val moonCountText = view.findViewById<TextView>(R.id.moonCountText)
        val planetImage = view.findViewById<ImageView>(R.id.imageView)

        val item = getItem(position) as Planets

        planetText.text = item.title
        moonCountText.text = item.moonCount
        planetImage.setImageResource(item.image)

        view.setOnClickListener {
            Toast.makeText(context, planets[position].title, Toast.LENGTH_SHORT).show()
        }

        return view
    }
}