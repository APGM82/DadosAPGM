package com.example.dadosapgm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

lateinit var txtDado1:TextView
lateinit var txtDado2:TextView
lateinit var txtres1:TextView
lateinit var txtres2:TextView
lateinit var bt : Button

var resultado1:Int = 0
var resultado2:Int = 0
var suma:Int=0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt = findViewById(R.id.btnBoton1)
        txtDado1=findViewById(R.id.textViewDado1)
        txtDado2=findViewById(R.id.textViewDado2)
        txtres1=findViewById(R.id.textViewResJ)
        txtres2=findViewById(R.id.textViewResPC)

        bt.setOnClickListener {
            resultado1=Random.nextInt(1,7)
            resultado2= Random.nextInt(1,7)
            txtDado1.text=resultado1.toString()
            txtDado2.text= resultado2.toString()
            txtres1.text= ((Integer.parseInt(txtres1.text.toString()))+ resultado1).toString()
            txtres2.text= ((Integer.parseInt(txtres2.text.toString()))+ resultado2).toString()
        }


    }
}