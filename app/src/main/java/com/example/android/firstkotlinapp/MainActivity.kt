package com.example.android.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number = 0
        val incrementButton = findViewById<Button>(R.id.buttonIncrement)
        val textViewNumber = findViewById<TextView>(R.id.textViewNumber)

        incrementButton.setOnClickListener {
            number++
            textViewNumber.text = number.toString()
        }
    }


}