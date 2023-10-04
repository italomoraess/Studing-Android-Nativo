package com.example.studingandroidnativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnAbrir: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_vida", "onCreate");

        setContentView(R.layout.activity_main)

        btnAbrir = findViewById(R.id.btn_abrir);
        btnAbrir.setOnClickListener{
            val intent = Intent(this, DetaisActivity::class.java);
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_vida", "onStart");

    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_vida", "onResume");

    }
}