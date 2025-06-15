package com.example.todo_app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignupInterfaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_interface)

        val textNavigate = findViewById<TextView>(R.id.textView24)
        textNavigate.setOnClickListener {
            val intent = Intent(this, LoginInterfaceActivity::class.java)
            startActivity(intent)
        }

        val btnNavigate: Button = findViewById(R.id.button)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, LoginInterfaceActivity::class.java)
            startActivity(intent)
        }
    }

}