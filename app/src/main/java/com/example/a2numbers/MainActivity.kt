package com.example.a2numbers

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // Connect the layout with the variables
        val number1 = findViewById<TextView>(R.id.et_num1)
        val number2 = findViewById<TextView>(R.id.et_num2)
        val multiplyButton = findViewById<Button>(R.id.B_Mult)
        val resultText = findViewById<TextView>(R.id.TV_Result)

        // Add functionality to the button
        multiplyButton.setOnClickListener() {
            var num1 = number1.text.toString().toDoubleOrNull()
            var num2 = number2.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                var result = num1 * num2
                resultText.text = "Result: $result"
            } else {
                resultText.text = "Please input valid numbers"
            }
        }
    }
}