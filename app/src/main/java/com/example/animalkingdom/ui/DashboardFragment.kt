package com.example.animalkingdom.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.animalkingdom.R
import androidx.navigation.fragment.findNavController


class DashboardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_dashboard, container, false)

        val btnAnimal:Button = view.findViewById(R.id.btnAnimal)
        val btnSpecies:Button = view.findViewById(R.id.btnSpecies)
        btnAnimal.setOnClickListener{ findNavController().navigate(R.id.action_dashboardFragment_to_animalListFragment)
        }
        btnSpecies.setOnClickListener{
            findNavController().navigate(R.id.action_dashboardFragment_to_speciesListFragment)
        }

        return  view
    }



}