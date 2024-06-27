package com.sinng.lifecylce

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.sinng.lifecylce.databinding.SecondActivityBinding

class SecondActivity : ComponentActivity() {
    private lateinit var binding: SecondActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i("Log", "onCreate()" + System.currentTimeMillis())
        binding.button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}