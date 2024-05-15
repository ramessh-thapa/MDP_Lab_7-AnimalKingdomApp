package com.example.animalkingdom.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "animals")
data class Animal(
    var name:String,
    var habitat:String,
    var diet:String,
): Serializable
{
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0
}
