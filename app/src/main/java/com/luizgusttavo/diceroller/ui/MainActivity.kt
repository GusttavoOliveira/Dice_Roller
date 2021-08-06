package com.luizgusttavo.diceroller.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.luizgusttavo.diceroller.R

class MainActivity : AppCompatActivity() {

    var diceSides = 6
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)
        diceImage = findViewById(R.id.diceNumber)

        rollButton.setOnClickListener {rollDice()}

    }

    private fun rollDice(){
        Toast.makeText(this, getString(R.string.dice_rolled), Toast.LENGTH_SHORT).show()

        val number = (1..diceSides).random()

        val drawableResource = when(number){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

    }

}