package com.example.cursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView:TextView = findViewById(R.id.textview) as TextView
        val editText:EditText = findViewById(R.id.edittext) as EditText
        val button: Button = findViewById(R.id.boton) as Button

        textView.text = "TextView con Kotlin"
        editText.setText("EditTextcon Kotiln")
        button.setOnClickListener(View.OnClickListener {
            var num = editText.text
            if(Integer.parseInt(num.toString()) > 10) {
                textView.text = "Es mayor a 10"
            } else {
                textView.text = "Es menor a 10"
            }
        })
    }
}