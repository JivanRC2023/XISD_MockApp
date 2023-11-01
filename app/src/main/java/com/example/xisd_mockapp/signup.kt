package com.example.xisd_mockapp

import android.accounts.Account
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.xisd_mockapp.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserProfileChangeRequest


class signup : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var username = "user";
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        val buttonSU: Button = findViewById(R.id.thanksReturn_btn)
        buttonSU.setOnClickListener {

            val email = binding.SignupEmail.text.toString()
            val password = binding.SignupPassword.text.toString()
            val name = binding.SignupName.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty() && name.isNotEmpty()) {
                firebaseAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener {
                        if (it.isSuccessful) {

                            val profileUpdates = UserProfileChangeRequest.Builder()
                                .setDisplayName(username)
                                .build()

                            val intent = Intent(this, Account::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT)
                                .show()
                        }
                    }
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }

            //new page
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }

    }
}