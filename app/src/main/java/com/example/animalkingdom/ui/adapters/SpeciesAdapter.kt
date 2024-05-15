package com.miu.mdp.speciekingdomexplorer.ui.speciesdetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.animalkingdom.R
import com.example.animalkingdom.data.model.Species
class SpecieListAdapter : ListAdapter<Species, SpecieListAdapter.SpecieViewHolder>(SpecieDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpecieViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.species_item_layout, parent, false)
        return SpecieViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SpecieViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }

    class SpecieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val specieNameTextView: TextView = itemView.findViewById(R.id.txtViewSpeciesName)
        private val specieDescriptionTextView: TextView = itemView.findViewById(R.id.txtViewSpeciesDesc)

        fun bind(species: Species
        ) {
            specieNameTextView.text = species.name
            specieDescriptionTextView.text =  species.description
        }
    }

    class SpecieDiffCallback : DiffUtil.ItemCallback<Species>() {
        override fun areItemsTheSame(oldItem: Species, newItem: Species): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Species, newItem: Species): Boolean {
            return oldItem == newItem
        }
    }
}