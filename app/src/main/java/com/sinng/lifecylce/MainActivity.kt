package com.sinng.lifecylce

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.sinng.lifecylce.databinding.MainActivityBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: MainActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i("Log", "onCreate()" + System.currentTimeMillis())
    }

    override fun onStart() {
        super.onStart()
        Log.i("Log", "onStart()" + System.currentTimeMillis())
    }

    override fun onResume() {
        super.onResume()
        Log.i("Log", "onResume()" + System.currentTimeMillis())
        binding.button.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        Log.i("Log", "onPause()" + System.currentTimeMillis())
    }
}



