package com.example.autocomplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.autocomplete.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cities = listOf<String>(
                "Caruaru",
                "Cabo de Santo Agostinho",
                "Recife",
                "São Paulo",
                "Santos",
                "Santa Cruz"
        )

        val adapter = ArrayAdapter<String>(
                this,
                android.R.layout.simple_dropdown_item_1line,
                cities
        )
        binding.actCities.setAdapter(adapter)
    }
}