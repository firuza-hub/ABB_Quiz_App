package com.example.abbfirebaseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth


class MainActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAuth = FirebaseAuth.getInstance();
        checkCurrentUser()

    }

    private fun checkCurrentUser() {
        // [START check_current_user]

        //FirebaseApp.initializeApp(applicationContext)
        val user = mAuth.currentUser
        if (user != null) {
            // User is signed in
           // startActivity(Intent(this, ActivityToLaunch::class.java))
        } else {
            startActivity(Intent(this, GoogleSignInActivity::class.java))
        }
        // [END check_current_user]
    }

}