package com.example.xisd_mockapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class account : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val buttonSU: Button = findViewById(R.id.signup_btn)
        buttonSU.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        val buttonLI: Button = findViewById(R.id.login_btn)
        buttonLI.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }


    }
}