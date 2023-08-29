package com.example.xisd_mockapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Forgot : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot)

        val buttonRP: Button = findViewById(R.id.thanksReturn_btn)
        buttonRP.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

    }
}