package com.example.auranote.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.auranote.R
import com.example.auranote.database.NoteDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NoteDatabase.getdatabase(this)

    }
}