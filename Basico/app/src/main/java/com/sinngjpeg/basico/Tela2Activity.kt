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
    }
}