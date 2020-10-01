package com.example.iconeevariastelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_exercicio1.*

class Exercicio1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercicio1)
    }

    fun calculoMedia(component: View) {
        val nomePessoa = et_nome.text.toString()
        val nota1 = et_nota1.text.toString().toDouble()
        val nota2 = et_nota2.text.toString().toDouble()
        val telaResultado = Intent(this, ResultadoEx1::class.java)
        telaResultado.putExtra("nome", nomePessoa)
        telaResultado.putExtra("nota1", nota1)
        telaResultado.putExtra("nota2", nota2)
        startActivity(telaResultado)

    }

}