package com.example.auranote.room
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.auranote.model.Usermodel

@Database(entities = [Usermodel::class], version = 1)
abstract class Appdatabase: RoomDatabase() {

    abstract fun userdata(): Userdao

}