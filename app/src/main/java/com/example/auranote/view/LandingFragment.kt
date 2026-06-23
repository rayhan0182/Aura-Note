package com.example.auranote.view
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.auranote.R
import com.example.auranote.basefrag.Basefragment
import com.example.auranote.databinding.FragmentLandingBinding

class LandingFragment : Basefragment<FragmentLandingBinding>(

    FragmentLandingBinding::inflate

) {
    override fun clickevent() {

        binding.add.setOnClickListener {

            findNavController().navigate(R.id.action_landingFragment_to_addnoteFragment)

        }



    }


}