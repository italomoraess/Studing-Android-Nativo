package com.example.studingandroidnativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetaisActivity : AppCompatActivity() {

    lateinit var btnFechar: Button;
    lateinit var textFilme: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detais)

        btnFechar = findViewById(R.id.btn_fechar);
        textFilme = findViewById(R.id.text_filme);

        val bundle = intent.extras;
        if (bundle != null) {
            val filme = bundle.getString("filme");
            textFilme.text = filme;
        }
        btnFechar.setOnClickListener { finish() }
    }
}