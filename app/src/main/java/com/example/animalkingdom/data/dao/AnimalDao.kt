package com.example.animalkingdom.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.animalkingdom.data.model.Animal

@Dao
interface AnimalDao {
    @Insert
    suspend fun addAnimal(animal: Animal)
    @Query("SELECT * FROM animals ORDER BY id DESC")
    fun getAllAnimals():LiveData<List<Animal>>
}