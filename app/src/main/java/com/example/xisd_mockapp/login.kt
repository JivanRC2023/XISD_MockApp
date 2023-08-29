package com.example.xisd_mockapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonLI: Button = findViewById(R.id.loginpage_btn)
        buttonLI.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

    }
}