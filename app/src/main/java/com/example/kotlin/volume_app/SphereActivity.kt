package com.example.kotlin.volume_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.kotlin.R

class SphereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sphere)
        val radiusEditText = findViewById<EditText>(R.id.editTextSphere)
        val volumeTextView = findViewById<TextView>(R.id.sphereVolumeTextView)
        val resultTextView = findViewById<TextView>(R.id.sphereResultTextView)
        val calculateButton = findViewById<Button>(R.id.sphereCalculateButton)

        calculateButton.setOnClickListener{
            var radius = radiusEditText.text.toString()
            var r = Integer.parseInt(radius)
            val pi = 3.14
            var volume = 4/3 * pi * r*r*r
            resultTextView.text = "$volume"
        }
    }
}