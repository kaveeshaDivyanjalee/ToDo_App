package com.example.todo_app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OnboardingInterface3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_interface3)

        val textNavigate = findViewById<TextView>(R.id.textView23)
        textNavigate.setOnClickListener {
            val intent = Intent(this, SignupInterfaceActivity::class.java)
            startActivity(intent)
        }
    }

}