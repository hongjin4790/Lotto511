package com.example.lotto511

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList
import kotlin.random.Random

fun getRandomLottoNumber(): Int{
    return Random.nextInt(45)+1
}


fun getRandomLottoNumbers(): MutableList<Int>{
    val lottoNumbers = mutableListOf<Int>()

    while(true){
        var number: Int = getRandomLottoNumber()
        var flag_existing : Int =0

        if(lottoNumbers.contains(number))
        {
//            flag_existing = 1

            continue
        }

//        if(flag_existing.equals(1))
//            continue
//        else
            lottoNumbers.add(number)

        if(lottoNumbers.size>=6)
            break;
    }

//    for(i in 1..6){
//        lottoNumbers.add(getRandomLottoNumber())
//    }
    return lottoNumbers
}

fun getShuffledLottoNumbers(): MutableList<Int>{
    val list = mutableListOf<Int>()

    for(number in 1..45){
        list.add(number)
    }
    list.shuffle()
    return list.subList(0,6)
}



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardRandom = findViewById<CardView>(R.id.cardNumber)

        val cardConstell = findViewById<CardView>(R.id.cardConstell)


        val goNameActivityCard = findViewById<CardView>(R.id.goNameCard)


        cardRandom.setOnClickListener {
            val intent = Intent(this,ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getShuffledLottoNumbers()))
            startActivity(intent)
        }

        goNameActivityCard.setOnClickListener {
            startActivity(Intent(this@MainActivity,NameActivity::class.java))
        }

        cardConstell.setOnClickListener {
            startActivity(Intent(this@MainActivity,constellationActivity::class.java))
        }



    }
}