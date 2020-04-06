package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda_actividad.*

class SegundaActividad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_actividad)
        val objetoIntent: Intent=intent
        var resultado = objetoIntent.getDoubleExtra("Resultado",0.0)
        var imc = ""
        if (resultado < 18.5){
            imc = "Usted se encuentra por debajo de lo normal :("
            imagen.setImageResource(R.drawable.ic_trofeobronce)
        }else if (resultado > 18.5 && resultado < 25){
            imc = "Usted se encuentra en lo normal :)"
        }
        else if (resultado > 25 && resultado < 30){
            imc = "Usted se encuentra un poco en sobrepeso -_- :)"
            imagen.setImageResource(R.drawable.ic_trofeobronce)
        }else{
            imc = "Usted es obeso..."
            imagen.setImageResource(R.drawable.ic_trofeobronce)
        }
        txtResultado.text = "Su masa corporal es de: $resultado"
        txtIMC.text = imc
    }
}
