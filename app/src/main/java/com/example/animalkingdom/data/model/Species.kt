package com.example.animalkingdom.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "species")
data class Species(
    var name:String,
    var description:String
): Serializable
{
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0
}
