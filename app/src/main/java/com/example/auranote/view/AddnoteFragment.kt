package com.example.auranote.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.auranote.R
import com.example.auranote.basefrag.Basefragment
import com.example.auranote.database.NoteDatabase
import com.example.auranote.databinding.FragmentAddnoteBinding

class AddnoteFragment : Basefragment<FragmentAddnoteBinding>(

    FragmentAddnoteBinding::inflate

) {
    override fun clickevent() {

        savenotedata()

    }

    private fun savenotedata() {

        binding.apply {

            save.setOnClickListener {

            val user_note = writingText.text.toString()



            }

        }

    }
}