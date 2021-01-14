package com.sinngjpeg.basico

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sinngjpeg.basico.databinding.ActivityTela2Binding
import org.parceler.Parcels

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityTela2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val nome = intent.getStringExtra("nome")
        val idade = intent.getIntExtra("idade", -1)
        binding.textMensagem.text = "Nome:$nome / Idade: $idade"


        val cliente = intent.getParcelableExtra<Cliente>("cliente")
        binding.textMensagem.text = if (cliente != null) {
            "Nome: ${cliente.nome} / Código: ${cliente.codigo}"
        } else {
            "Nome: $nome / Idade: $idade"
        }

        val pessoa =
            intent.getSerializableExtra("pessoa") as Pessoa? //o objeto pessoa pode ser nulo
        if (pessoa != null) {
            binding.textMensagem.text = "Nome: ${pessoa.nome} / Idade: ${pessoa.idade}"
        }
    }

    ///////////////////////////CICLO DE VIDA

    override fun onStart() {
        super.onStart()
        Log.i("NGVL", "Tela2::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("NGVL", "Tela2::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("NGVL", "Tela2::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("NGVL", "Tela2::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("NGVL", "Tela2::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("NGVL", "Tela2::onDestroy")
    }
}