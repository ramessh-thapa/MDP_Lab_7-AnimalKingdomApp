package com.example.animalkingdom.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.animalkingdom.data.model.Species

@Dao
interface SpecieDao {
    @Insert
    suspend fun addSpecies(species: Species)
    @Query("SELECT * FROM species ORDER BY id DESC")
    fun getAllSpecies(): LiveData<List<Species>>
}