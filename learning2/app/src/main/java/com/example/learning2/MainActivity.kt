package com.example.learning2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.learning2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        fABTest()

    }
    private fun fABTest(){
        binding.FAB1.setOnClickListener{
            Toast.makeText(this,"done",Toast.LENGTH_SHORT).show()
        }
    }
}