package com.sinngjpeg.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sinngjpeg.intents.databinding.ActivityActionBinding


class ActionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityActionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (intent.action == Intent.ACTION_VIEW) {
            val uri = intent.data
            uri?.let {
                binding.txtAction.text = getString(R.string.custom_action2, uri.toString(), uri.host, uri.path)
            }
        } else if (intent.action == "dominando.android.CUSTOM_ACTION") {
            binding.txtAction.text = getString(R.string.custom_action1)
        }
    }
}