package com.example.xisd_mockapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val buttonA: Button = findViewById(R.id.Account_btn)
        buttonA.setOnClickListener {
            val intent = Intent(this, account::class.java)
            startActivity(intent)
        }

        val buttonWeb: Button = findViewById(R.id.Website_btn)
        buttonWeb.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }

        val buttonCont: Button = findViewById(R.id.Contact_btn)
        buttonCont.setOnClickListener {
            val intent = Intent(this, contact::class.java)
            startActivity(intent)
        }

        val buttonServ: Button = findViewById(R.id.Services_btn)
        buttonServ.setOnClickListener {
            val intent = Intent(this, services::class.java)
            startActivity(intent)
        }

        val buttonDon: Button = findViewById(R.id.Donate_btn)
        buttonDon.setOnClickListener {
            val intent = Intent(this, donate::class.java)
            startActivity(intent)
        }

        val buttonReq: Button = findViewById(R.id.Request_btn)
        buttonReq.setOnClickListener {
            val intent = Intent(this, Request::class.java)
            startActivity(intent)
        }

    }
}