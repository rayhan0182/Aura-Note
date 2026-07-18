package com.example.auranote.architech.repo

import com.example.auranote.architech.service.service
import com.example.auranote.model.Usermodel
import com.example.auranote.room.Userdao
import javax.inject.Inject

class Repo_note @Inject constructor(private val userdao: Userdao) : service {
    override suspend fun Addnote(usermodel: Usermodel) {
        userdao.insertdata(usermodel)
    }
}
