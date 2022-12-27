package com.example.practicerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val list: List<String>): RecyclerView.Adapter<ViewHolderItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val item = LayoutInflater.from(parent.context)
            .inflate(R.layout.sample_cell, parent, false)
        return ViewHolderItem(item)
    }

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.textViewItem.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }

}