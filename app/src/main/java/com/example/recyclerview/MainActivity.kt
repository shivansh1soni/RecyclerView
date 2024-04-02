package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv)

        val data = mutableListOf<News>().also {
            it.add(News((R.drawable.ic_launcher_background), "News 1"))
            it.add(News((R.drawable.ic_launcher_background), "News 2"))
            it.add(News((R.drawable.ic_launcher_background), "News 3"))
            it.add(News((R.drawable.ic_launcher_background), "News 4"))
            it.add(News((R.drawable.ic_launcher_background), "News 5"))
            it.add(News((R.drawable.ic_launcher_background), "News 6"))
            it.add(News((R.drawable.ic_launcher_background), "News 7"))
            it.add(News((R.drawable.ic_launcher_background), "News 8"))
            it.add(News((R.drawable.ic_launcher_background), "News 9"))
            it.add(News((R.drawable.ic_launcher_background), "News 10"))
        }

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = CustomAdapter(data)

    }
}