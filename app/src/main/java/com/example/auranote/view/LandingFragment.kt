package com.example.auranote.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.auranote.R
import com.example.auranote.databinding.FragmentLandingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LandingFragment : Fragment() {
    private lateinit var binding: FragmentLandingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLandingBinding.inflate(layoutInflater)

        binding.add.setOnClickListener {
            findNavController().navigate(R.id.action_landingFragment_to_addnoteFragment)
        }

        return binding.root
    }
}
