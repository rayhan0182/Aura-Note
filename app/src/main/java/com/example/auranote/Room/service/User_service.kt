package com.example.auranote.Room.service

import com.example.auranote.model.Note

interface User_service {

    suspend fun insert_data(note: Note)


}