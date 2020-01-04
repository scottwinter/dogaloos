package com.fourheronsstudios.dogaloos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val items: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Populate the list of items and their data
        loadItems()

        // Creates a vertical Layout Manager
        rv_list_items.layoutManager = LinearLayoutManager(this)

        // Access the RecyclerView Adapter and load the data into it
        rv_list_items.adapter = ItemAdapter(items, this)
    }


    fun loadItems(){
        items.add("Restaurant 1")
        items.add("Shop 1")
        items.add("Restaurant 2")
        items.add("Restaurant 3")
        items.add("Shop 2")
        items.add("Restaurant 4")
        items.add("Restaurant 5")
        items.add("Shop 3")
        items.add("Restaurant 6")
    }
}
