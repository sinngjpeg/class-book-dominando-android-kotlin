package com.example.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.customview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.jogoDaVelha.listener = object : JogoDaVelhaView.JogoDaVelhaListener {
            override fun fimDeJogo(vencedor: Int) {
                val mensagem = when (vencedor) {
                    JogoDaVelhaView.XIS -> "X venceu"
                    JogoDaVelhaView.BOLA -> "O venceu"
                    else -> "Empatou"
                }
                Toast.makeText(this@MainActivity, mensagem, Toast.LENGTH_LONG).show()
            }
        }
        binding.button.setOnClickListener { binding.jogoDaVelha.reiniciarJogo() }
    }
}