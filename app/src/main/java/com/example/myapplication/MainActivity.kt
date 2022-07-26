package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val boxOneTV = findViewById<TextView>(R.id.boxOne)
        val boxTwoTV: TextView = findViewById(R.id.box2)
        val boxThreeTV: TextView = findViewById(R.id.box3)
        val boxFourTV: TextView = findViewById(R.id.box4)
        val boxFiveTV: TextView = findViewById(R.id.box5)

        val clickableViews: List<View> =
            listOf(
                boxOneTV,boxTwoTV,boxThreeTV,boxFourTV,boxFiveTV
            )

        for(item in clickableViews){
            item.setOnClickListener{ makeColored(it) }
        }
    }

    private fun makeColored(view: View){
        when (view.id){
            R.id.boxOne -> view.setBackgroundColor(Color.LTGRAY)
            R.id.box2 -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box3 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box4 -> view.setBackgroundColor(Color.GRAY)
            R.id.box5 -> view.setBackgroundColor(Color.TRANSPARENT)
            else -> view.setBackgroundColor(Color.RED)
        }

    }
}