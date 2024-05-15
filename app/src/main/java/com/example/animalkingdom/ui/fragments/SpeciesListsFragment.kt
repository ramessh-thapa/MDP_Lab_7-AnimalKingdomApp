package com.example.animalkingdom.ui.fragments;

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.example.animalkingdom.R
import com.example.animalkingdom.data.model.Species
import com.example.animalkingdom.ui.fragments.base.BaseFragment
import com.example.animalkingdom.ui.utilitites.toast
import com.example.animalkingdom.ui.viewModels.SpeciesViewModel

import com.miu.mdp.speciekingdomexplorer.ui.speciesdetails.SpecieListAdapter
import kotlinx.coroutines.launch

class SpeciesListsFragment : BaseFragment() {

    companion object {
        fun newInstance() = SpeciesListsFragment()
    }

    private lateinit var vm: SpeciesViewModel
    private lateinit var rvSpecies: RecyclerView
    private lateinit var speciesVM: SpeciesViewModel

    override fun <T> addItem(item: T) {
        launch {
            context?.let {
                speciesVM.insert(item as Species)
                it.toast("New Species Added Successfully")
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_species_list, container, false)
        rvSpecies = view.findViewById(R.id.recyclerViewSpecies)
        rvSpecies.layoutManager = LinearLayoutManager(requireContext())
        val adapter = SpecieListAdapter()
        rvSpecies.adapter = adapter
        speciesVM = ViewModelProvider(this).get(SpeciesViewModel::class.java)
        speciesVM.allSpecies.observe(viewLifecycleOwner, Observer { species -> species?.let { adapter.submitList(it) } })

        val btnAddSpecies = view.findViewById<FloatingActionButton>(R.id.btnAddSpecies)
        btnAddSpecies.setOnClickListener{
            val dialog =
                SpeciesDialogFragment()
            dialog.parentFragment = this
            dialog.show(parentFragmentManager,"Add Species")
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        vm = ViewModelProvider(this).get(SpeciesViewModel::class.java)
    }
}