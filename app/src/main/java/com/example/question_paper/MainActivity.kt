package com.example.question_paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.click)
        btn.setOnClickListener {
            intent = Intent(applicationContext,Question::class.java)
            startActivity(intent)

            Toast.makeText(this, "Your Data has  been saved", Toast.LENGTH_SHORT).show()
        }
    }
}