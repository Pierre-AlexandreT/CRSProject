package com.pat.crsproject.ui.adapter

import android.view.ViewGroup

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.pat.crsproject.data.model.Seance
import com.pat.crsproject.ui.viewholder.SeanceViewHolder


class SeanceAdapter : ListAdapter<Seance, SeanceViewHolder>(Companion){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeanceViewHolder {
        return SeanceViewHolder.create(parent)
    }

    override fun onBindViewHolder(holder: SeanceViewHolder, position: Int) {
        getItem(position)?.run { holder.bind(this) }
    }

    companion object : DiffUtil.ItemCallback<Seance>() {
        override fun areItemsTheSame(oldItem: Seance, newItem: Seance): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Seance , newItem: Seance): Boolean {
            return oldItem == newItem
        }
    }
}