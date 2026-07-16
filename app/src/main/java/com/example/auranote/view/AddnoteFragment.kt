package com.example.auranote.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.room.Room
import com.example.auranote.databinding.FragmentAddnoteBinding
import com.example.auranote.room.Appdatabase


class AddnoteFragment : Fragment() {

    private lateinit var binding: FragmentAddnoteBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {



        binding = FragmentAddnoteBinding.inflate(layoutInflater)

        return binding.root
    }

}








