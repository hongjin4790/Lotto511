package com.example.lotto511

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goNameActivityCard = findViewById<CardView>(R.id.goNameCard)



        goNameActivityCard.setOnClickListener {
            startActivity(Intent(this@MainActivity,NameActivity::class.java))
        }
    }
}