package com.example.iconeevariastelas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela3.*

class Tela3 : AppCompatActivity() {
    var contador = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        contador++

        val usuario = intent.getStringExtra("usuario")
        val saldo = intent.getDoubleExtra("saldo", 0.0)
        val contaEncerrada = intent.getBooleanExtra("contaEncerrada", false)

        tv_tela3.text = """
            Estou na 3ª tela pela ${contador}ª vez
            O usuário é ${usuario}, que tem R$${saldo} em conta.
            Conta encerrada? ${if (contaEncerrada) "Sim" else "Não"}
        """.trimIndent()

    }
}