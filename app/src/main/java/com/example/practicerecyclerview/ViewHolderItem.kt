package com.example.practicerecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ViewHolderItem(itemView: View): RecyclerView.ViewHolder(itemView) {

    val textViewItem: TextView = itemView.findViewById(R.id.textView)
}