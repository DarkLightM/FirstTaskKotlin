package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

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
        val button = findViewById<Button>(R.id.okButton)
        val value = findViewById<TextInputEditText>(R.id.enterText).text
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("key", value.toString())
            }
            startActivity(intent)
        }
    }

}