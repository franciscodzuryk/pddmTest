package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var textViewConsole: TextView? = null
    private var editTextDataIn: EditText? = null
    private var buttonEnter: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewConsole = findViewById<TextView>(R.id.textViewConsole)
        editTextDataIn = findViewById<EditText>(R.id.editTextDataIn)
        buttonEnter = findViewById<Button>(R.id.buttonEnter)

        buttonEnter?.setOnClickListener(View.OnClickListener {
            println("El botón ENTER ha sido presionado")
            val texto = editTextDataIn!!.text
            textViewConsole!!.setText(texto)
            //textViewConsole.let {  }
        })
    }

    fun myMethod() {

    }

    fun anotherMethod() {

    }
}