package com.example.helloworld

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var Txtv: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent1 = intent
        val txt1 = intent1.getStringExtra("TEXT1")
        val txt2 = intent1.getStringExtra("TEXT2")
        Txtv = findViewById(R.id.textView)
        Txtv.text = "" + txt1 + "\n" + txt2

    }
}