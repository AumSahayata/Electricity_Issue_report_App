package com.example.electricityissuereport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.electricityissuereport.databinding.ActivityStatusBinding

class StatusActivity : AppCompatActivity() {
    private lateinit var binding:ActivityStatusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityStatusBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            val back = Intent(this,HomeActivity::class.java)
            startActivity(back)
            finish()
        }
    }
}