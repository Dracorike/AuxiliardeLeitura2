package com.petruciostech.auxiliardeleitura.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.petruciostech.auxiliardeleitura.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao:Button = findViewById(R.id.buttonLogin)

        botao.setOnClickListener(View.OnClickListener {
            val itente:Intent = Intent(this, Colecao::class.java)
            startActivity(itente)
        })
    }

}