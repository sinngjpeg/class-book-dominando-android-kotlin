package com.sinngjpeg.basico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sinngjpeg.basico.databinding.ActivityMainBinding
import com.sinngjpeg.basico.databinding.ActivityMainBinding.inflate
import com.sinngjpeg.basico.databinding.ActivityTela2Binding
import com.sinngjpeg.basico.databinding.ActivityTela2Binding.inflate

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
}