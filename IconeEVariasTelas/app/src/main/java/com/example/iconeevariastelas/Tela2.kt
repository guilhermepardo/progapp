package com.example.iconeevariastelas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
    }

    override fun onBackPressed() {
        Toast.makeText(this, "Esta preso aqui! kkkkk", Toast.LENGTH_SHORT).show()

    }

    fun irTela3(component:View) {
        val tela3 = Intent(this, Tela3::class.java)
        tela3.putExtra("saldo", "Zé Ruela")
        tela3.putExtra("saldo", 1500.50)
        tela3.putExtra("contaEncerrada", false)
        startActivity(tela3)
    }

}