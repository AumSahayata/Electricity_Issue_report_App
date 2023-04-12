package com.example.electricityissuereport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.electricityissuereport.databinding.ActivityHomeBinding
import com.example.electricityissuereport.databinding.ActivityMainBinding
import com.example.electricityissuereport.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            val back_btn = Intent(this,HomeActivity::class.java)
            startActivity(back_btn)
            finish()
        }
        binding.logout.setOnClickListener {
            val logout_btn = Intent(this,MainActivity::class.java)
            startActivity(logout_btn)
            finish()
        }
    }
}