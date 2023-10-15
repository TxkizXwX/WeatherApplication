package com.example.weatherapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import com.example.weatherapplication.databinding.ActivityLocationBinding

class LocationActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLocationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }

        val countryList = arrayOf("Russia", "USA", "Uzbekistan", "Brazil", "Portugal", "England")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, countryList)

        binding.location.setAdapter(adapter)

        binding.location.setOnItemClickListener { parent, view, position, id ->
            val selectedLocation = parent.getItemAtPosition(position) as String
            intent.putExtra("selectedLocation", selectedLocation)
            startActivity(intent)
            finish()
        }
    }
}