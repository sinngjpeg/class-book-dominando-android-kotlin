package com.sinngjpeg.textview

import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Typeface
import android.graphics.drawable.BitmapDrawable
import android.os.Build
import android.os.Bundle
import android.text.Html
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.*
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sinngjpeg.textview.databinding.ActivityMainBinding
import java.io.IOException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.txtStrike.paintFlags = binding.txtStrike.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        val htmlText = """
            <html>
            <body>Html em <b>Negrito</b>, <i>Itálico</i>
            e <u>Sublinhado</u>.<br>
            Mario: <img src='mario.png' /><br>
            Yoshi: <img src='yoshi.png' /><br>
            Um texto depois da imagem
            </body>
            </html>"""

        val imageGetter = Html.ImageGetter { source ->
            try {
                val bmp = BitmapFactory.decodeStream(assets.open(source))
                val drawable = BitmapDrawable(resources, bmp)
                drawable.setBounds(0, 0, bmp.width, bmp.height)
                drawable
            } catch (e: IOException) {
                e.printStackTrace()
                null
            }
        }
        binding.txtHtml.text = if (Build.VERSION.SDK_INT >=
            Build.VERSION_CODES.N
        ) {
            Html.fromHtml(htmlText, Html.FROM_HTML_MODE_COMPACT, imageGetter, null)
        } else
            Html.fromHtml(htmlText, imageGetter, null)
    }

}
