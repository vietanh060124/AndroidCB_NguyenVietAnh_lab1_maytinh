package com.example.maytinh

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var etFirstNumber: EditText
    lateinit var etSecondNumber: EditText
    lateinit var tvResult: TextView
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivide: Button
    lateinit var btnModulus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etSecondNumber)
        tvResult = findViewById(R.id.tvResult)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
        btnModulus = findViewById(R.id.btnModulus)

        btnAdd.setOnClickListener { calculate('+') }
        btnSubtract.setOnClickListener { calculate('-') }
        btnMultiply.setOnClickListener { calculate('*') }
        btnDivide.setOnClickListener { calculate('/') }
        btnModulus.setOnClickListener { calculate('%') }
    }

    private fun calculate(operator: Char) {
        val num1 = etFirstNumber.text.toString().toDouble()
        val num2 = etSecondNumber.text.toString().toDouble()
        var result = 0.0

        when (operator) {
            '+' -> result = num1 + num2
            '-' -> result = num1 - num2
            '*' -> result = num1 * num2
            '/' -> result = num1 / num2
            '%' -> result = num1 % num2
        }
        tvResult.text = "Result: $result"
    }
}