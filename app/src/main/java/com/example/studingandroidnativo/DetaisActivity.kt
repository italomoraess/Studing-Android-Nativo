package com.example.studingandroidnativo

import android.os.Build
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
            val filme = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                bundle.getParcelable("filme", Filme::class.java);
            } else{
                bundle.getParcelable("filme");
            }
            textFilme.text = "${filme?.nome} - ${filme?.distribuidor}";
        }
        btnFechar.setOnClickListener { finish() }
    }
}