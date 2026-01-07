package com.example.kotlin.grocery_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.R

class GroceryApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery_app)
        val recyclerView: RecyclerView = findViewById(R.id.groceryRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        val groceryItems: ArrayList<Grocery> = ArrayList()
        val groceryItem1 = Grocery(R.drawable.ic_launcher_foreground, "Fruits", "Fresh Fruits from the garden")
        val groceryItem2 = Grocery(R.drawable.ic_launcher_foreground, "Vegetables", "Delicious Vegetables")
        val groceryItem3 = Grocery(R.drawable.ic_launcher_foreground, "Bakery", "Bread, Wheat and Beans")
        val groceryItem4 = Grocery(R.drawable.ic_launcher_foreground, "Beverages", "Juice, Tea, Coffee and Soda")
        val groceryItem5 = Grocery(R.drawable.ic_launcher_foreground, "Milk", "Milk, Shakes and Yogurt")
        val groceryItem6 = Grocery(R.drawable.ic_launcher_foreground, "Snacks", "Pop Corn, Donut and Drinks")
        groceryItems.add(groceryItem1)
        groceryItems.add(groceryItem2)
        groceryItems.add(groceryItem3)
        groceryItems.add(groceryItem4)
        groceryItems.add(groceryItem5)
        groceryItems.add(groceryItem6)

        val groceryAdapter = GroceryAppAdapter(groceryItems) { grocery ->
            Toast.makeText(
                this,
                "You chose ${grocery.title}",
                Toast.LENGTH_SHORT
            ).show()
        }

        recyclerView.adapter = groceryAdapter

    }
}