package com.luizgusttavo.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)

        rollButton.setOnClickListener {rollDice()}
    }

    private fun rollDice(){
        Toast.makeText(this, getString(R.string.dice_rolled), Toast.LENGTH_SHORT).show()

        val number = (1..6).random()

        val resultText: TextView = findViewById(R.id.diceNumber)
        resultText.text = number.toString()

    }
}