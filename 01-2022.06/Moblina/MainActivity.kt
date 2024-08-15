package com.example.domek_w_gorach

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val polubPrzycisk: Button = findViewById(R.id.button)
        val usunPrzycisk: Button = findViewById(R.id.button2)
        val tekst: TextView = findViewById(R.id.textView2)
        var licznik = 0

        polubPrzycisk.setOnClickListener {
            licznik+=1
            tekst.text= licznik.toString() + " polubień"
        }
        usunPrzycisk.setOnClickListener{
            if(licznik>0){
                licznik-=1
                tekst.text = licznik.toString() + " polubień"
            }
        }
    }
}