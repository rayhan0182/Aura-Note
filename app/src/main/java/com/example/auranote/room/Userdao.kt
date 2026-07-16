package com.example.auranote.room
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.auranote.model.Usermodel

@Dao
interface Userdao {

    @Insert

    suspend fun insertdata(user: Usermodel)

    @Query("SELECT * FROM Usermodel")

    suspend fun getdata(): List<Usermodel>

    @Delete

    suspend fun deletedata(user: Usermodel)

    @Update

    suspend fun update(user: Usermodel)

}



