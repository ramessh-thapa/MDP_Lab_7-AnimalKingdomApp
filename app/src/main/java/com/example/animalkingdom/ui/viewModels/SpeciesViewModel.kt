package com.example.animalkingdom.ui.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.animalkingdom.data.database.AppDatabase
import com.example.animalkingdom.data.model.Species
import com.example.animalkingdom.data.repository.SpeciesRepository
import kotlinx.coroutines.launch

class SpeciesViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: SpeciesRepository
    val allSpecies: LiveData<List<Species>>

    init {
        val specieDao = AppDatabase(application.applicationContext).getSpecieDao()
        repository = SpeciesRepository(specieDao)
        allSpecies = repository.allSpecies
    }

    fun insert(species: Species) = viewModelScope.launch {
        repository.insert(species)
    }
}
