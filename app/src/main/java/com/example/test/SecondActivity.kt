package com.example.test

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        val info = intent?.getStringExtra("key").toString()
        val resultView = findViewById<TextView>(R.id.resultView)
        resultView.text = info
    }
}