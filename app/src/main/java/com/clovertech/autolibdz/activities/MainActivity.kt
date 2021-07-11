package com.clovertech.autolibdz.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.clovertech.autolibdz.R
import com.clovertech.autolibdz.activities.auth.LoginActivity
import com.clovertech.autolibdz.activities.auth.RegisterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signin_btn.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

        signup_btn.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }

    }

}