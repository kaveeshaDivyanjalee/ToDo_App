package com.example.todo_app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView

class HomeInterfaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_interface)

        val imgNavigate = findViewById<ImageView>(R.id.imageView18)
        imgNavigate.setOnClickListener {
            val intent = Intent(this, ProfileInterfaceActivity::class.java)
            startActivity(intent)
        }

        val imgNavigate1 = findViewById<ImageView>(R.id.imageView6)
        imgNavigate1.setOnClickListener {
            val intent = Intent(this, MenubarInterfaceActivity::class.java)
            startActivity(intent)
        }

        val imgNavigate2 = findViewById<ImageView>(R.id.imageView21)
        imgNavigate2.setOnClickListener {
            val intent = Intent(this, AddtaskInterfaceActivity::class.java)
            startActivity(intent)
        }

        val imgNavigate3= findViewById<ImageView>(R.id.imageView10)
        imgNavigate3.setOnClickListener {
            val intent = Intent(this, ViewtaskInterfaceActivity::class.java)
            startActivity(intent)
        }
    }

}