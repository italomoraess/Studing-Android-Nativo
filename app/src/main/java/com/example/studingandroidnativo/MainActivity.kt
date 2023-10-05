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
            intent.putExtra("filme", "The Witcher")
            startActivity(intent)

            val filme = Filme(
                "sem limites",
                "teste",
                4.8,
                "Italo moraes",
                "Netflix"
            );

            intent.putExtra("filme", filme);
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