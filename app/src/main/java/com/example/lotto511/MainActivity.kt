package com.example.lotto511

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardRandom = findViewById<CardView>(R.id.cardNumber)

        val cardConstell = findViewById<CardView>(R.id.cardConstell)


        val goNameActivityCard = findViewById<CardView>(R.id.goNameCard)


        cardRandom.setOnClickListener {
            startActivity(Intent(this@MainActivity,ResultActivity::class.java))
        }

        goNameActivityCard.setOnClickListener {
            startActivity(Intent(this@MainActivity,NameActivity::class.java))
        }

        cardConstell.setOnClickListener {
            startActivity(Intent(this@MainActivity,constellationActivity::class.java))
        }


    }
}