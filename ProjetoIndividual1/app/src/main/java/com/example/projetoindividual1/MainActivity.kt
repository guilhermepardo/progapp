package com.example.projetoindividual1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun botaoValidacao(components:View) {

        var nome = et_texto.text.toString();
        var primeiro_numero = et_texto2.text.toString().toInt();
        var segundo_numero = et_texto3.text.toString().toInt();

    if (nome == "Gersinho") {
        tx_resultado.text = "Eu avisei! Não irei fazer nada."
        tx_resultado.setTextColor(Color.RED)
    } else {
        if (primeiro_numero == 0 && segundo_numero == 0) {
            tx_resultado.text = "Digite pelo menos um número acima de 0 em um dos campos!"
            tx_resultado.setTextColor(Color.BLUE)
        } else {
            var soma = primeiro_numero + segundo_numero
            tx_resultado.text = "Opa, "+nome+", a soma desses números deu: "+soma+""
            tx_resultado.setTextColor(Color.GREEN)
        }
    }

    }

}