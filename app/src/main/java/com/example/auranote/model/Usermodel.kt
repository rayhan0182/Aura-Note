package com.example.auranote.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Usermodel(

    @PrimaryKey

    val id: Int,

    val title: String,

    val date: String,

    val time: String,

    val note: String
)
