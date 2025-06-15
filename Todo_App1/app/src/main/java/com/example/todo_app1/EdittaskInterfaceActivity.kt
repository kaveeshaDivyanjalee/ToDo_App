package com.example.todo_app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EdittaskInterfaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edittask_interface)

        val btnNavigate: Button = findViewById(R.id.button)
        btnNavigate.setOnClickListener {
            val intent = Intent(this, HomeInterfaceActivity::class.java)
            startActivity(intent)
        }
    }


}