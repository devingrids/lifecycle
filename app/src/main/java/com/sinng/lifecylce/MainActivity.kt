package com.sinng.lifecylce

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.sinng.lifecylce.databinding.MainActivityBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: MainActivityBinding
    private lateinit var resultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i("Log", "onCreate() MainActivity" + System.currentTimeMillis())

        resultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                if (result.resultCode == Activity.RESULT_OK) {
                    val data: Intent? = result.data
                    Toast.makeText(
                        this@MainActivity,
                        data?.getStringExtra("RETURN"),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Log", "onStart() MainActivity" + System.currentTimeMillis())
    }

    override fun onResume() {
        super.onResume()
        Log.i("Log", "onResume() MainActivity" + System.currentTimeMillis())

        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("TEXT_VALUE", binding.editTextMain.text.toString())
            resultLauncher.launch(intent)
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
