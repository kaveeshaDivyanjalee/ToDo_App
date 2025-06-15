package com.example.todo_app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OnboardingInterface2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_interface2)

        val textNavigate = findViewById<TextView>(R.id.textView26)
        textNavigate.setOnClickListener{
            val intent = Intent(this,OnboardingInterface3Activity::class.java)
            startActivity(intent)
        }
    }
}