package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataSet: MutableList<News>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val heading: TextView
        val image: ImageView

        init {
            // Define click listener for the ViewHolder's View
            heading = view.findViewById(R.id.heading)
            image = view.findViewById(R.id.imageView)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.custom_layout, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        val currentPosition = dataSet[position]
        viewHolder.heading.text = currentPosition.newsHeading
        viewHolder.image.setImageResource(currentPosition.newsImage)
    }

    override fun getItemCount() = dataSet.size

}
