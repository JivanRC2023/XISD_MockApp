package com.example.xisd_mockapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.xisd_mockapp.databinding.ActivityRequestBinding
import com.example.xisd_mockapp.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.IgnoreExtraProperties
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Request : AppCompatActivity() {
    private lateinit var binding: ActivityRequestBinding
    private lateinit var firebaseAuth: FirebaseAuth
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var username = "user";
        binding = ActivityRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()
        database = Firebase.database.reference


        val buttonreq: Button = findViewById(R.id.BeneficiaryRequestButton)
        buttonreq.setOnClickListener {
            val item = binding.RequestedItem.text.toString()
            val quantity = binding.ItemQuantity.text.toString()
            val location = binding.Location.text.toString()

            @IgnoreExtraProperties
            data class User(val item: String = binding.RequestedItem.text.toString(),
                            val quantity: String = binding.ItemQuantity.text.toString(),
                            val location: String = binding.Location.text.toString()) {
                // Null default values create a no-argument default constructor, which is needed
                // for deserialization from a DataSnapshot.
            }

        }
    }
}