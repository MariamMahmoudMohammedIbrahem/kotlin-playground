package com.example.kotlin.fragment_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.kotlin.R
import org.w3c.dom.Text

class FragmentApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_app)
        val appText: TextView = findViewById(R.id.fragmentAppTextView)
        val button1: Button = findViewById(R.id.showFragmentButton1)
        val button2: Button = findViewById(R.id.showFragmentButton2)
        val fragmentFrameLayout: FrameLayout = findViewById(R.id.fragmentFrameLayout)

        button1.setOnClickListener {
            val fragment1 = Fragment1()
            loadFragment(fragment1)
        }

        button2.setOnClickListener {
            val fragment2 = Fragment2()
            loadFragment(fragment2)
        }
    }

    fun loadFragment(fragment: Fragment){
        // Fragment Manager: responsible for managing fragments
        // in activity . it keeps track of the fragment lifecycle
        // and handles transactions involving fragments
        val fragmentManager = supportFragmentManager

        // Fragment transaction: used to define set of operations
        // to be perform on fragments

        // common operations include adding, removing, replacing fragments
        // and managing the backstack of fragments
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentFrameLayout, fragment)
        fragmentTransaction.commit()
    }
}