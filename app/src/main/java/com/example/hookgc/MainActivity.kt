package com.example.hookgc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bytedance.android.bytehook.ByteHook
import com.example.hookgc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ByteHook.init();

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = "抑制Gc"
    }
}