package com.example.textandscrollview

import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi

// In MainActivity.kt



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val layout = findViewById<ConstraintLayout>(R.id.layout)
        val switch = findViewById<Switch>(R.id.sdark)
        val btnIntent = findViewById<Button>(R.id.button1)

        btnIntent.setOnClickListener {
            // open a new activity
            intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)

        }

        switch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                layout.setBackgroundColor(getColor(R.color.black))
            } else {
                layout.setBackgroundColor(getColor(android.R.color.white))
            }
        }
    }
}
