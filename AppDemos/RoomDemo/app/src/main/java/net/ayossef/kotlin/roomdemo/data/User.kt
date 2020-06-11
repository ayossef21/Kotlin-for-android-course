package net.ayossef.kotlin.roomdemo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_tbl")
data class User(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var name:String,
    var email:String)