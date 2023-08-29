package com.example.xisd_mockapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val buttonSU: Button = findViewById(R.id.thanksReturn_btn)
        buttonSU.setOnClickListener {
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

    }
}