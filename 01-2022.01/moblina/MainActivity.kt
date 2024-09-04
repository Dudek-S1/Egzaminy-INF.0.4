package com.example.rejestruj_konto

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.resources.TextAppearanceFontCallback

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
        val email: EditText = findViewById(R.id.email_input)
        val haslo: EditText = findViewById(R.id.haslo_input)
        val powHaslo: EditText = findViewById(R.id.powHaslo_input)
        val info: TextView = findViewById(R.id.info)

        val przycisk: Button = findViewById(R.id.button)

        info.text="Autor 90924876102"

        val hasloText = haslo.text
        val powHasloText = powHaslo.text


        przycisk.setOnClickListener {
            if(!email.text.contains('@')){
                info.text="Nieprawidłowy adres e-mail"
            }
            else if(hasloText.toString() != powHasloText.toString()){
                info.text="Hasła się różnią"
            }
            else{
                info.text = "Witaj "+email.text
            }
        }

    }
}