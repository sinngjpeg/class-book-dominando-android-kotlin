package com.sinngjpeg.basico


import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sinngjpeg.basico.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
//      settando o layout
        setContentView(binding.root)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        //setta botao
        val buttonToast = binding.buttonToast
        val buttonTela2 = binding.buttonTela2
        val buttonParcel = binding.buttonParcel
        val buttonSerialazible = binding.buttonSerializable

//      settando o botao para receber as informacoes inclusas no editText
        buttonToast.setOnClickListener {
            val text = binding.editText.text.toString()
//          Mostra uma mensagem Longa de 3,5 segundos com as informacoes que forao inclusas no text
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

        buttonTela2.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("nome", "Glauber")
            intent.putExtra("idade", 35)
            startActivity(intent)
        }

        buttonParcel.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("cliente", Cliente(2, "Nelson"))
            startActivity(intent)
        }

        buttonSerialazible.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("pessoa", Pessoa("Nelson", 35))
            startActivity(intent)
        }
    }

    ////////////////////////// CLICLOS DE VIDA

    override fun onStart() {
        super.onStart()
        Log.i("NGVL", "Tela1::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("NGVL", "Tela1::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("NGVL", "Tela1::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("NGVL", "Tela1::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("NGVL", "Tela1::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("NGVL", "Tela1::onDestroy")
    }
}