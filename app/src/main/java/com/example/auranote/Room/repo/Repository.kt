package com.example.auranote.Room.repo
import com.example.auranote.Room.service.User_service
import com.example.auranote.dao.NoteDao
import com.example.auranote.database.NoteDatabase
import com.example.auranote.model.Note

class Repository(

    private var noteDao: NoteDao

): User_service {

    override suspend fun insert_data(note: Note) {

        noteDao.insertNote(note)

    }
}