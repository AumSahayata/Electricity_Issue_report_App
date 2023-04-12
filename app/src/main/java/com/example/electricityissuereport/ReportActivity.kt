package com.example.electricityissuereport

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.electricityissuereport.databinding.ActivityHomeBinding
import com.example.electricityissuereport.databinding.ActivityReportBinding

class ReportActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReportBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityReportBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.submit.setOnClickListener {

            Toast.makeText(applicationContext,"Your request is successfully submitted.",Toast.LENGTH_SHORT).show()

            val submitIntent = Intent(this,HomeActivity::class.java)
            startActivity(submitIntent)
            finish()
        }
    }
}