package com.example.kotlin.sports_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.R

class SportsApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports_app)
        val recyclerView: RecyclerView = findViewById(R.id.sportsRecyclerView)
        recyclerView.layoutManager  = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
        val sportsList = ArrayList<SportModel>()
        val sport1 = SportModel(R.drawable.ic_launcher_background, "Football")
        val sport2 = SportModel(R.drawable.ic_launcher_foreground, "Basketball")
        val sport3 = SportModel(R.drawable.ic_launcher_background, "Ping Bong")
        val sport4 = SportModel(R.drawable.ic_launcher_foreground, "Tennis")
        val sport5 = SportModel(R.drawable.ic_launcher_background, "VolleyBall")
        sportsList.add(sport1)
        sportsList.add(sport2)
        sportsList.add(sport3)
        sportsList.add(sport4)
        sportsList.add(sport5)

        val sportsAdapter = SportsAppAdapter(sportsList)
        recyclerView.adapter = sportsAdapter
    }
}