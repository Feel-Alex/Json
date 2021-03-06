package com.example.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.json.R
import com.example.json.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
    }
}