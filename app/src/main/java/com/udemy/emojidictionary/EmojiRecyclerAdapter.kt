package com.udemy.emojidictionary

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EmojiRecyclerAdapter : RecyclerView.Adapter<EmojiRecyclerAdapter.TextHolder> {

    class TextHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextHolder {
        return TextHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item_row, parent, false))

    }

    //How many things will show up in the recyclerView
    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: EmojiRecyclerAdapter.TextHolder, position: Int) {
        holder
    }
}