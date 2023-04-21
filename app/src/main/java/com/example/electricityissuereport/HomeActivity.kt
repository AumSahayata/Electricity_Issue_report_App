package com.example.electricityissuereport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.electricityissuereport.databinding.ActivityHomeBinding
import com.example.electricityissuereport.databinding.ActivityProfileBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.newRqt.setOnClickListener {
            val intent = Intent(this,ReportActivity::class.java)
            startActivity(intent)
        }
        binding.compStrlit.setOnClickListener {
            val intent = Intent(this,ReportActivity::class.java)
            startActivity(intent)
        }
        binding.issue.setOnClickListener {
            val intent = Intent(this,ReportActivity::class.java)
            startActivity(intent)
        }
        binding.noelec.setOnClickListener {
            val intent = Intent(this,ReportActivity::class.java)
            startActivity(intent)
        }
        binding.profile.setOnClickListener {
            val profile_page = Intent(this,ProfileActivity::class.java)
            startActivity(profile_page)
        }
        binding.track.setOnClickListener {
            val status = Intent(this,StatusActivity::class.java)
            startActivity(status)
        }
    }
}