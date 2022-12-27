package com.example.practicerecyclerview

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ViewHolderItem(itemView: View): RecyclerView.ViewHolder(itemView) {

    val textViewItem: TextView = itemView.findViewById(R.id.textView)

    private val recyclerAdapter = RecyclerAdapter()
    private val animalList = recyclerAdapter.animals

    init {
        itemView.setOnClickListener {
            val position: Int = adapterPosition

            Toast.makeText(itemView.context, animalList[position], Toast.LENGTH_SHORT).show()
        }
    }
}