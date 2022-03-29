package com.example.northerandroidproject.activities


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.northerandroidproject.R
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val database = Firebase.database
        val myEmail = database.getReference("Email")

        myEmail.setValue("Sharmamohit096@gmail.com")
        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }


}