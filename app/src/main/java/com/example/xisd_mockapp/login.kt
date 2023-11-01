package com.example.xisd_mockapp

import android.accounts.Account
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.xisd_mockapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class login : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        val buttonLI: Button = findViewById(R.id.login_btn)
        buttonLI.setOnClickListener {
            val email = binding.LoginEmail.text.toString()
            val password = binding.LoginPassword.text.toString()

            if(email.isNotEmpty() && password.isNotEmpty()) {
                firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful){
                        val intent = Intent(this, Account::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }

            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }

    }
}