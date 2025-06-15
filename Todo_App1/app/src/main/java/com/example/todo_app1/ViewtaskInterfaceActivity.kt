package com.example.todo_app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ViewtaskInterfaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.viewtask_interface)

        val btnNavigate: Button = findViewById(R.id.button1)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, EdittaskInterfaceActivity::class.java)
            startActivity(intent)
        }

        val btnNavigate4: Button = findViewById(R.id.button)
        btnNavigate4.setOnClickListener {
            val intent = Intent(this, HomeInterfaceActivity::class.java)
            startActivity(intent)
        }
    }


}