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
    }

    override fun onStart() {
        super.onStart()
        binding.textSecond.text = intent.getStringExtra("TEXT_VALUE")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Log", "onResume() Second Activity " + System.currentTimeMillis())

        binding.button.setOnClickListener {
            val data = Intent()
            data.putExtra("RETURN", binding.editTextSecond.toString())
            setResult(RESULT_OK, data)
            finish()

        }
    }
}