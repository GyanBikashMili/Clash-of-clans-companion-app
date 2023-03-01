package com.example.textandscrollview

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val layout = findViewById<ConstraintLayout>(R.id.layout)
        val switch = findViewById<Switch>(R.id.sdark2)
        val btnIntent = findViewById<Button>(R.id.button2)

        btnIntent.setOnClickListener {
            // open a new activity
            intent = Intent(applicationContext, MainActivity::class.java)
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