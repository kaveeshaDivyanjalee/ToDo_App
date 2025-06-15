package com.example.todo_app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MenubarInterfaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menubar_interface)

        val imgNavigate1 = findViewById<ImageView>(R.id.imageView34)
        imgNavigate1.setOnClickListener {
            val intent = Intent(this, ProfileInterfaceActivity::class.java)
            startActivity(intent)
        }

        val imgNavigate2 = findViewById<ImageView>(R.id.imageView36)
        imgNavigate2.setOnClickListener {
            val intent = Intent(this, AboutInterfaceActivity::class.java)
            startActivity(intent)
        }
    }
}