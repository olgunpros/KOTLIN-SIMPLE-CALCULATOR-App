package com.olgunbingol.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.olgunbingol.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun topla(view: View) {
        val number1 = binding.number1.text.toString().toDoubleOrNull()
        val number2 = binding.number2.text.toString().toDoubleOrNull()
        if(number1 != null && number2 != null) {
            val result = number1+number2
            binding.resultText.text = "Result: ${result}"

        }
        else {
            binding.resultText.text = "Enter number!"
        }

    }
    fun cikar(view: View) {
        val number1 = binding.number1.text.toString().toDoubleOrNull()
        val number2 = binding.number2.text.toString().toDoubleOrNull()
        if(number1!= null && number2!= null) {
            val result = number1-number2
            binding.resultText.text = "Result: ${result}"
        }
        else {
            binding.resultText.text = "Enter number!"
        }

    }
    fun carp(view: View) {
        val number1 = binding.number1.text.toString().toDoubleOrNull()
        val number2 = binding.number2.text.toString().toDoubleOrNull()
        if(number1!= null && number2!= null) {
            val result = number1*number2
            binding.resultText.text = "Result: ${result}"
        }
        else {
            binding.resultText.text = "Enter number!"
        }

    }
    fun bol(view: View) {
        val number1 = binding.number1.text.toString().toDoubleOrNull()
        val number2 = binding.number2.text.toString().toDoubleOrNull()
        if(number1!= null && number2!= null) {
            val result = (number1/number2)
            binding.resultText.text = "Result: ${result}"
        }
        else {
            binding.resultText.text = "Enter number!"
        }

    }

}