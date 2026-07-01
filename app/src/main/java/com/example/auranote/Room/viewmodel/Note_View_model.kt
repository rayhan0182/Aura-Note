package com.example.auranote.Room.viewmodel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.auranote.Room.repo.Repository
import com.example.auranote.model.Note
import kotlinx.coroutines.launch

class Note_View_model(

    private val repository: Repository

): ViewModel() {

    fun dataAdd(note: Note){

        viewModelScope.launch {

           // repository.insert_data(note)

        }

    }


}