package com.example.continuadasegundasprint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun comprar(view: View) {

        val etNum1:EditText = findViewById(R.id.et_numero1)
        val etNum2:EditText = findViewById(R.id.et_numero2)

        val num1 = etNum1.text.toString().toInt()
        val num2 = etNum2.text.toString().toInt()

        if (num1 < 1 || num1 > 100) {
            etNum1.error = "O identificador deve estar entre 1 e 100"
        } else if (num2 < 1 || num2 > 100) {
            etNum2.error = "O identificador deve estar entre 1 e 100"
        } else {
            val tela2 = Intent(this, Tela2::class.java)
            startActivity(tela2)
        }
    }
}