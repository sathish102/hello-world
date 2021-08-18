package com.example.helloworld

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Helpers.update
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var mtext1: EditText
    lateinit var mtext2: EditText
    lateinit var mdisplay: TextView
    lateinit var mbutton: Button
    lateinit var mtext3 : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mtext1 = findViewById(R.id.editTextTextPersonName1)
        mtext2 = findViewById(R.id.editTextTextPersonName2)
        mbutton = findViewById(R.id.button)
        mtext3 = findViewById(R.id.name_tv)


        mtext3.text= "My name is santhosh"


        mbutton.setOnClickListener {


            val text1 = mtext1.text.toString()
            val text2 = mtext2.text.toString()
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
               intent.putExtra("TEXT1", text1)
               intent.putExtra("TEXT2", text2)
               startActivity(intent)




        }
    }
}















