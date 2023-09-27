package com.example.travelerstalks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText = findViewById<EditText>(R.id.textoSearch)

        // Create a Paint object to style the text
        val paint = editText.paint

        // Set the underline flag
        val valor = editText.text.toString().trim()
        paint.isUnderlineText = valor.isEmpty()
    }
}