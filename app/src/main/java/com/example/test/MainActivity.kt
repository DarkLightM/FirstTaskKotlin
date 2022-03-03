package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val view = findViewById<TextView>(R.id.textView)
        view.text = "Testing shit"
        val student = Student ("Max", "3")
        val nameView = findViewById<TextView>(R.id.nameTextView)
        nameView.text = student.name
        val objNameVie = findViewById<TextView>(R.id.objNameView)
        objNameVie.text = student.toString()
    }

}