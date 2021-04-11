package com.sinngjpeg.orientacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.sinngjpeg.orientacao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var names = arrayListOf<String>()
    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState != null) {
            names = savedInstanceState.getStringArrayList("names_list") ?: arrayListOf()
        }

        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        var lstNames = binding.lstNames
        lstNames.adapter = adapter
    }

    fun btnAddClick(view: View) {
        names.add(binding.edtName.text.toString())
        binding.edtName.text.clear()
        adapter?.notifyDataSetChanged()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putStringArrayList("names_list", names)
    }
}