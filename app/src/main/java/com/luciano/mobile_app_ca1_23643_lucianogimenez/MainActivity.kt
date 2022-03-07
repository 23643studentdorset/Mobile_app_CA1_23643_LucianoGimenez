package com.luciano.mobile_app_ca1_23643_lucianogimenez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("checker", "starting")

        val closeButton = findViewById<FloatingActionButton>(R.id.closeButton)
        val educationButton = findViewById<Button>(R.id.educationButton)
        /*val skillsButton = findViewById<FloatingActionButton>(R.id.skillsButton)
        val hobbiesButton = findViewById<FloatingActionButton>(R.id.hobbiesButton)
        val achievementsButton = findViewById<FloatingActionButton>(R.id.achievementsButton)
        */
        closeButton.setOnClickListener {
            finish()
        }
        educationButton.setOnClickListener {
            val intent = Intent(this, Education::class.java)
            startActivity(intent)
        }

        /*skillsButton.setOnClickListener {
            val skillsActivity = Intent(this, Skills::class.java)
            startActivity(skillsActivity)
        }
        hobbiesButton.setOnClickListener {
            val skillsActivity = Intent(this, Skills::class.java)
            startActivity(skillsActivity)
        }
        achievementsButton.setOnClickListener {
            val skillsActivity = Intent(this, Skills::class.java)
            startActivity(skillsActivity)
        }
    */
    }


}