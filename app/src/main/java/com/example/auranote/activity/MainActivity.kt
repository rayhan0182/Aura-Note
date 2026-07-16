package com.example.auranote.activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.auranote.R
import com.example.auranote.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}