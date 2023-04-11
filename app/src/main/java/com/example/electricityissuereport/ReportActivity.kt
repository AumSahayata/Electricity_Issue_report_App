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
        super.onCreate(savedInstanceState)
        binding = ActivityReportBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener {

            Toast.makeText(this,"Your request is successfully submitted.",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,ActivityHomeBinding::class.java)
            startActivity(intent)
            finish()
        }
    }
}