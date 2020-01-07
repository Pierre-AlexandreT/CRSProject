package com.pat.crsproject.ui.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pat.crsproject.R
import com.pat.crsproject.data.model.Seance
import kotlinx.android.synthetic.main.seance_holder.view.*

class SeanceViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {




    fun bind(model: Seance) {
        itemView.apply {
            this.seance_row.text= model.titre
        }
    }

    companion object {
        /**
         * Create a new Instance of [SeanceViewHolder]
         */
        fun create(parent: ViewGroup): SeanceViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(
                R.layout.seance_holder,
                parent,
                false
            )
            return SeanceViewHolder(view)
        }
    }

}