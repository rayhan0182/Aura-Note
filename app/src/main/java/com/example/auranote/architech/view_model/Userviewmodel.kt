package com.example.auranote.architech.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.auranote.architech.repo.Repo_note
import com.example.auranote.model.Usermodel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class Userviewmodel @Inject constructor(private val repository: Repo_note) : ViewModel() {

    fun createdata(user: Usermodel) {
        viewModelScope.launch {
            try {
                repository.Addnote(user)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
