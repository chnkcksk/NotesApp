package com.example.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val txtBtnSignUp = findViewById<TextView>(R.id.txtBtnSignUp)
        txtBtnSignUp.setOnClickListener {
            val intent = Intent(this, RegisterScreen::class.java)
            startActivity(intent)
        }

        val btnSignin = findViewById<Button>(R.id.btnSignin)
        btnSignin.setOnClickListener{
            val intent = Intent(this, NotesScreen::class.java)
            startActivity(intent)
        }



    }
}