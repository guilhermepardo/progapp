package com.example.iconeevariastelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun irTela2(componente:View) {
        val tela2 = Intent(this, Tela2::class.java)
        startActivity(tela2)
    }

    fun irExercicio1(componente: View) {
        val telaExercicio1 = Intent(this, Exercicio1::class.java)
        startActivity(telaExercicio1)
    }

}