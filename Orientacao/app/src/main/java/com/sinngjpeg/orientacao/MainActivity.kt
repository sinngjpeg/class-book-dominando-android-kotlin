package com.sinngjpeg.orientacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import com.sinngjpeg.orientacao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var names = arrayListOf<String>()
    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        val list = android.R.layout.simple_list_item_1
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        if (savedInstanceState != null) {
            names = savedInstanceState.getStringArrayList("names_list") ?: arrayListOf()
        }
        adapter = ArrayAdapter(this, list, names)
        binding.lstNames.adapter = adapter
    }

    fun btnAddClick(view: View) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        names.add(binding.edtName.text.toString())
        binding.edtName.text.clear()
        adapter?.notifyDataSetChanged()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putStringArrayList("names_list", names)
    }
}