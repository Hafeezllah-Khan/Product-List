package com.example.listitemsprinter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ProductAdapter
    private lateinit var productList: List<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        productList = generateDummyData()
        // Add your Product objects to the productList here

        adapter = ProductAdapter(productList, this)
        recyclerView.adapter = adapter
    }


    private fun generateDummyData(): List<Product> {
        val products = mutableListOf<Product>()

        products.add(Product(true, "Chicken Burger", 2, "PKR 295"))
        products.add(Product(false, "Cheese Pizza", 1, "PKR 350"))
        products.add(Product(true, "French Fries", 3, "PKR 150"))
        products.add(Product(false, "Coke", 4, "PKR 100"))

        return products
    }
}
