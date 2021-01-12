package com.sinngjpeg.basico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.sinngjpeg.basico.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
//      settando o layout
        setContentView(binding.root)

        //setta botao
        val button = binding.buttonToast

//      settando o botao para receber as informacoes inclusas no editText
        button.setOnClickListener {
           val text = binding.editText.text.toString()
//          Mostra uma mensagem Longa de 3,5 segundos com as informacoes que forao inclusas no text
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}