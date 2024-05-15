package com.miu.mdp.animalkingdomexplorer.ui.animalsdetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.animalkingdom.R
import com.example.animalkingdom.data.model.Animal
class AnimalListAdapter : ListAdapter<Animal, AnimalListAdapter.AnimalViewHolder>(AnimalDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.animal_item_layout, parent, false)
        return AnimalViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }

    class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         private val animalNameTextView: TextView = itemView.findViewById(R.id.txtViewAnimalName)
        private val animalHabitatTextView: TextView = itemView.findViewById(R.id.txtViewAnimalHabitat)
        private val animalDietTextView: TextView = itemView.findViewById(R.id.txtViewAnimalDiet)

        fun bind(animal: Animal
        ) {
            animalNameTextView.text = animal.name
            animalDietTextView.text =  animal.diet
            animalHabitatTextView.text = animal.habitat

        }
    }

    class AnimalDiffCallback : DiffUtil.ItemCallback<Animal>() {
        override fun areItemsTheSame(oldItem: Animal, newItem: Animal): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Animal, newItem: Animal): Boolean {
            return oldItem == newItem
        }
    }
}