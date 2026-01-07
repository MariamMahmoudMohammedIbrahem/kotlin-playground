package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import com.example.kotlin.volume_app.CubeActivity
import com.example.kotlin.volume_app.CylinderActivity
import com.example.kotlin.volume_app.PrismActivity
import com.example.kotlin.volume_app.Shape
import com.example.kotlin.volume_app.SphereActivity
import com.example.kotlin.volume_app.VolumeAppAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gridView: GridView = findViewById(R.id.gridView)
        val shape1 = Shape(R.drawable.ic_launcher_foreground, "Sphere")
        val shape2 = Shape(R.drawable.ic_launcher_foreground, "Cube")
        val shape3 = Shape(R.drawable.ic_launcher_foreground, "Prism")
        val shape4 = Shape(R.drawable.ic_launcher_foreground, "Cylinder")
        val shapeList = ArrayList<Shape>()
        shapeList.add(shape1)
        shapeList.add(shape2)
        shapeList.add(shape3)
        shapeList.add(shape4)

        val shapeAdapter= VolumeAppAdapter(this, shapeList)
        gridView.adapter = shapeAdapter

        gridView.setOnItemClickListener{_,_,position,_ ->
            val clickedItem = shapeAdapter.getItem(position)
            if(clickedItem?.title.equals("Sphere")) {
                val intent = Intent(this, SphereActivity::class.java)
                startActivity(intent)
            }
            else if(clickedItem?.title.equals("Cube")) {
                val intent = Intent(this, CubeActivity::class.java)
                startActivity(intent)
            }
            else if(clickedItem?.title.equals("Prism")) {
                val intent = Intent(this, PrismActivity::class.java)
                startActivity(intent)
            }
            else if(clickedItem?.title.equals("Cylinder")) {
                val intent = Intent(this, CylinderActivity::class.java)
                startActivity(intent)
            }
        }
//        val adapter = ArrayAdapter(
//            this,
//            android.R.layout.custom_layout, //how the data will be displayed
//            operatingSystems //datasource
//        )
    }
}