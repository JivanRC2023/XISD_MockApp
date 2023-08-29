package com.example.xisd_mockapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Thanks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thanks)

        val buttonthx: Button = findViewById(R.id.donation_btn)
        buttonthx.setOnClickListener {
            val intent = Intent(this, thanks::class.java)
            startActivity(intent)
        }

    }
}