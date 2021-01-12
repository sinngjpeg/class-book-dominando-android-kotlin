package com.sinngjpeg.basico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//      settando o layout
        setContentView(R.layout.activity_main)

        // criando variavel para receber os itens do layout
        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.buttonToast)

//      settando o botao para receber as informacoes inclusas no editText
        button.setOnClickListener{
            val text = editText.text.toString()
//          Mostra uma mensagem Longa de 3,5 segundos com as informacoes que forao inclusas no text
            Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
        }
    }
}