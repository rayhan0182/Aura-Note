package com.example.auranote.architech.service

import com.example.auranote.model.Usermodel

interface service {

    suspend fun Addnote(usermodel: Usermodel)


}