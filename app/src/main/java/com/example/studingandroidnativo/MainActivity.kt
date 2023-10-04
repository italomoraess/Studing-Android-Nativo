package com.example.studingandroidnativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnAbrir: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbrir = findViewById(R.id.btn_abrir);
        btnAbrir.setOnClickListener{
            val intent = Intent(this, DetaisActivity::class.java);
            startActivity(intent)
        }
    }
}