package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button = findViewById<Button>(R.id.button)
        Button.setOnClickListener {
            val intent1 = Intent(this, Tiramisu::class.java)
            startActivity(intent1)}
            val Button1 = findViewById<Button>(R.id.button2)
            Button1.setOnClickListener {
                val intent2 = Intent(this, Kulfi::class.java)
                startActivity(intent2)}
                val Button2 = findViewById<Button>(R.id.button3)
                Button2.setOnClickListener {
                    val intent3 = Intent(this, Churros::class.java)
                    startActivity(intent3)}
                    val Button3 = findViewById<Button>(R.id.button4)
                    Button3.setOnClickListener {
                        val intent4 = Intent(this, Baklava::class.java)
                        startActivity(intent4)}
                    }
                }
