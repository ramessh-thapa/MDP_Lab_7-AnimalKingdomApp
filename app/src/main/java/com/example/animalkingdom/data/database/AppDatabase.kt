package com.example.animalkingdom.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.animalkingdom.data.dao.AnimalDao
import com.example.animalkingdom.data.dao.SpecieDao
import com.example.animalkingdom.data.model.Animal
import com.example.animalkingdom.data.model.Species

@Database(
    entities = [Animal::class, Species::class],
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun getAnimalDao(): AnimalDao
    abstract fun getSpecieDao(): SpecieDao

    companion object {

        @Volatile
        private var instance: AppDatabase? = null
        private val LOCK =   Any()
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }
        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "assigment-mdp-7-db"
        ).build()
    }
}