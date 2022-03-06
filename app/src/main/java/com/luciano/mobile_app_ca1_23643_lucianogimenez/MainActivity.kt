package com.luciano.mobile_app_ca1_23643_lucianogimenez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("checker", "starting")

        val closeButton = findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.closeButton)
        val educationButton = findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.educationButton)
        val skillsButton = findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.skillsButton)
        val hobbiesButton = findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.hobbiesButton)
        val achievementsButton = findViewById<com.google.android.material.floatingactionbutton.FloatingActionButton>(R.id.achievementsButton)

        closeButton.setOnClickListener {
            finishActivity()
        }
        educationButton.setOnClickListener {
            val educationActivity = Intent(this, Education::class.java)
            startActivity(educationActivity)
        }
        skillsButton.setOnClickListener {
        }
        hobbiesButton.setOnClickListener {
        }
        achievementsButton.setOnClickListener {
        }

    }

    private fun finishActivity() {
        finish()
    }
}