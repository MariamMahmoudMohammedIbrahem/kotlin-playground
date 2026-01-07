package com.example.kotlin.volume_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.kotlin.R

class CylinderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cylinder)
        val radiusEditText = findViewById<EditText>(R.id.editTextCylinder)
        val volumeTextView = findViewById<TextView>(R.id.cylinderVolumeTextView)
        val resultTextView = findViewById<TextView>(R.id.cylinderResultTextView)
        val calculateButton = findViewById<Button>(R.id.cylinderCalculateButton)

        calculateButton.setOnClickListener{
            var radius = radiusEditText.text.toString()
            var r = Integer.parseInt(radius)
            val pi = 3.14
            var volume = 4/3 * pi * r*r*r
            resultTextView.text = "$volume"
        }
    }
}