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

//        val adapter = ArrayAdapter(
//            this,
//            android.R.layout.custom_layout, //how the data will be displayed
//            operatingSystems //datasource
//        )
    }
}