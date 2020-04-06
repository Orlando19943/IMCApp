package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to button
        val btn_click_me = findViewById(R.id.button) as Button
        // set on-click listener
        btn_click_me.setOnClickListener {
            var Peso = txtPeso.text.toString().toDouble()/2.205
            var Estatura = txtEstatura.text.toString().toDouble()/100
            var Resultado:Double = Peso/(Estatura*Estatura)
            var intent = Intent(this,SegundaActividad::class.java)
            intent.putExtra("Resultado", Resultado)
            startActivity(intent)
        }
        btn_click_me.setOnLongClickListener{
            Toast.makeText(this, "Formula: Peso (kg) / Estatura² (m)", Toast.LENGTH_SHORT).show()
            return@setOnLongClickListener true
        }

    }


}
