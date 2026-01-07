package com.example.kotlin.volume_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.kotlin.R

class CubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cube)
        val radiusEditText = findViewById<EditText>(R.id.editTextCube)
        val volumeTextView = findViewById<TextView>(R.id.cubeVolumeTextView)
        val resultTextView = findViewById<TextView>(R.id.cubeResultTextView)
        val calculateButton = findViewById<Button>(R.id.cubeCalculateButton)

        calculateButton.setOnClickListener{
            var radius = radiusEditText.text.toString()
            var r = Integer.parseInt(radius)
            val pi = 3.14
            var volume = 4/3 * pi * r*r*r
            resultTextView.text = "$volume"
        }
    }
}