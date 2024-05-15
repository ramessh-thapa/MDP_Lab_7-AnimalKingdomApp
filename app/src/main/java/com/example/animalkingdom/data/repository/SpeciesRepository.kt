package com.example.animalkingdom.data.repository

import androidx.lifecycle.LiveData
import com.example.animalkingdom.data.dao.SpecieDao
import com.example.animalkingdom.data.model.Species

class SpeciesRepository(private val specieDao: SpecieDao) {
    val allSpecies: LiveData<List<Species>> = specieDao.getAllSpecies()

    suspend fun insert(species: Species) {
        specieDao.addSpecies(species)
    }
}
