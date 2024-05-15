package com.example.animalkingdom.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.animalkingdom.R
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.example.animalkingdom.data.model.Animal
import com.example.animalkingdom.ui.fragments.base.BaseFragment
import com.example.animalkingdom.ui.utilitites.toast
import com.example.animalkingdom.ui.animalsdetails.AnimalViewModel
import com.miu.mdp.animalkingdomexplorer.ui.animalsdetails.AnimalListAdapter
import kotlinx.coroutines.launch


class AnimalListFragment() : BaseFragment() {

    private lateinit var vm: AnimalViewModel
    private lateinit var rvAnimal: RecyclerView
    private lateinit var animalvm: AnimalViewModel
    override fun <T> addItem(item: T) {
        launch {
            context?.let {
                animalvm.insert(item as Animal)
                it.toast("New Animal Added successfully.")
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_animal_list, container, false)

        rvAnimal = view.findViewById(R.id.recyclerViewAnimal)
        rvAnimal.layoutManager = LinearLayoutManager(requireContext())
        val adapter = AnimalListAdapter()
        rvAnimal.adapter = adapter
        animalvm = ViewModelProvider(this).get(AnimalViewModel::class.java)
        animalvm.allAnimals.observe(viewLifecycleOwner, Observer { animals ->
            animals?.let { adapter.submitList(it) }
        })


        val btnAddAnimal = view.findViewById<FloatingActionButton>(R.id.btnAddAnimal)
        btnAddAnimal.setOnClickListener{
            val dialog =
                AnimalDialogFragment()
            dialog.parentFragment = this
            dialog.show(parentFragmentManager,"Add Animal")
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        vm = ViewModelProvider(this).get(AnimalViewModel::class.java)
    }

}