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
        Log.i("Log", "onCreate() MainActivity" + System.currentTimeMillis())
    }

    override fun onStart() {
        super.onStart()
        Log.i("Log", "onStart() MainActivity" + System.currentTimeMillis())
    }

    override fun onResume() {
        super.onResume()
        Log.i("Log", "onResume() MainActivity" + System.currentTimeMillis())
        binding.button.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onPause() {
        super.onPause()
        Log.i("Log", "onPause() MainActivity" + System.currentTimeMillis())
    }

    override fun onStop() {
        super.onStop()
        Log.i("Log", "onStop() MainActivity" + System.currentTimeMillis())
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Log", "onDestroy() MainActivity" + System.currentTimeMillis())
    }
}
