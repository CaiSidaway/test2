package com.example.lecture3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var points = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberMaker()
    }

    fun numberMaker() {
        val randNum = Random()
        val leftNum = randNum.nextInt(10)
        val rightNum = randNum.nextInt(10)

        val leftButton = findViewById<Button>(R.id.buttonLeft)
        val rightButton = findViewById<Button>(R.id.buttonRight)

        leftButton.text = leftNum.toString()
        rightButton.text = rightNum.toString()
    }

    fun leftButtonClick(view: View) {
        val leftButton = findViewById<Button>(R.id.buttonLeft)
        val rightButton = findViewById<Button>(R.id.buttonRight)
        val pointLabel = findViewById<TextView>(R.id.textScore)

        val leftNumber = buttonLeft.text.toString().toInt()
        val rightNumber = buttonRight.text.toString().toInt()

        if (leftNumber >= rightNumber) {
            points++
            pointLabel.text = "Points = $points"
        } else {
            points--
            pointLabel.text = "Points = $points"
        }
        numberMaker()
    }

    fun rightButtonClick(view: View) {
        val leftButton = findViewById<Button>(R.id.buttonLeft)
        val rightButton = findViewById<Button>(R.id.buttonRight)
        val pointLabel = findViewById<TextView>(R.id.textScore)

        val leftNumber = buttonLeft.text.toString().toInt()
        val rightNumber = buttonRight.text.toString().toInt()

        if (rightNumber >= leftNumber) {
            points++
            pointLabel.text = "Points = $points"
        } else {
            points--
            pointLabel.text = "Points = $points"
        }
        numberMaker()
    }


}