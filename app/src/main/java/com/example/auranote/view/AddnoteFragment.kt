package com.example.auranote.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.auranote.architech.view_model.Userviewmodel
import com.example.auranote.databinding.FragmentAddnoteBinding
import com.example.auranote.model.Usermodel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddnoteFragment : Fragment() {

    private lateinit var binding: FragmentAddnoteBinding
    private val viewmodel: Userviewmodel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddnoteBinding.inflate(layoutInflater)

        binding.save.setOnClickListener {
            val notedata = binding.writingText.text
            val data = Usermodel(1, "", "", "", notedata.toString())
            viewmodel.createdata(data)
        }

        return binding.root
    }
}
