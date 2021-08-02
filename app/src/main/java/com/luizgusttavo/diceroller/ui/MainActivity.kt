package com.luizgusttavo.diceroller.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.luizgusttavo.diceroller.R

class MainActivity : AppCompatActivity() {

    var diceSides = 6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)
        val buttonSizeSix: Button = findViewById(R.id.buttonSizeSix)
        val buttonSizeTen: Button = findViewById(R.id.buttonSizeTen)
        val buttonSizeTwenty: Button = findViewById(R.id.buttonSizeTwenty)

        rollButton.setOnClickListener {rollDice()}
        buttonSizeSix.setOnClickListener {setSides(buttonSizeSix)}
        buttonSizeTen.setOnClickListener {setSides(buttonSizeTen)}
        buttonSizeTwenty.setOnClickListener {setSides(buttonSizeTwenty)}

    }

    private fun rollDice(){
        Toast.makeText(this, getString(R.string.dice_rolled), Toast.LENGTH_SHORT).show()

        val number = (1..diceSides).random()

        val resultText: TextView = findViewById(R.id.diceNumber)
        resultText.text = number.toString()

    }

    private fun setSides(view: Button){
        val id = view.id

        when(id){
            R.id.buttonSizeSix ->{
                diceSides = 6
                Toast.makeText(this, "D6 setted", Toast.LENGTH_SHORT).show()
            }
            R.id.buttonSizeTen -> {
                diceSides = 10
                Toast.makeText(this, "D10 setted", Toast.LENGTH_SHORT).show()
            }
            R.id.buttonSizeTwenty -> {
                diceSides = 20
                Toast.makeText(this, "D20 setted", Toast.LENGTH_SHORT).show()
            }
        }

    }
}