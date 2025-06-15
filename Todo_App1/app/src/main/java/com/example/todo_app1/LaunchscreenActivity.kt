package com.example.todo_app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LaunchscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launchscreen)

        val imgNavigate = findViewById<ImageView>(R.id.imageView23)

        imgNavigate.setOnClickListener {
            val intent = Intent(this, OnboardingInterface1Activity::class.java)
            startActivity(intent)
        }

    }
}