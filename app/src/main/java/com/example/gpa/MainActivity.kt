package com.example.gpa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var a1 = editTextNumber.text.toString()
            var a2 = editTextNumber2.text.toString()
            var a3 = editTextNumber3.text.toString()
            var a4 = editTextNumber4.text.toString()
            var a5 = editTextNumber5.text.toString()
            var b1 = editTextNumber6.text.toString()
            var b2 = editTextNumber7.text.toString()
            var b3 = editTextNumber8.text.toString()
            var b4 = editTextNumber9.text.toString()
            var b5 = editTextNumber10.text.toString()
            if (a1 == "" || a2 == "" || a3 == "" || a4 == "" || a5 == "" || b5 == "" || b2 == "" || b3 == "" || b4 == "" || b5 == "" || editTextTextPersonName.text.isEmpty() || editTextTextPersonName2.text.isEmpty() || editTextTextPersonName3.text.isEmpty() || editTextTextPersonName4.text.isEmpty() || editTextTextPersonName5.text.isEmpty())
                return@setOnClickListener Toast.makeText(
                    this@MainActivity,
                    "Plase Input All Text Box Before Press OK!!",
                    Toast.LENGTH_SHORT
                ).show()
            var w = a1.toInt() + a2.toInt() + a3.toInt() + a4.toInt() + a5.toInt()
            textView13.text = w.toString()
            var Sum = 0.0
            Sum += (a1.toDouble() * b1.toDouble()) + (a2.toDouble() * b2.toDouble()) + (a3.toDouble() * b3.toDouble()) + (a4.toDouble() * b4.toDouble()) + (a5.toDouble() * b5.toDouble())
            textView14.text = String.format("%.2f,Sum/w")
        }
            button2.setOnClickListener{
                editTextNumber.text.clear()
                editTextTextPersonName.text.clear()
                editTextTextPersonName2.text.clear()
                editTextTextPersonName3.text.clear()
                editTextTextPersonName4.text.clear()
                editTextTextPersonName5.text.clear()
                editTextNumber2.text.clear()
                editTextNumber3.text.clear()
                editTextNumber4.text.clear()
                editTextNumber5.text.clear()
                editTextNumber6.text.clear()
                editTextNumber7.text.clear()
                editTextNumber8.text.clear()
                editTextNumber9.text.clear()
                editTextNumber10.text.clear()
                textView13.text=""
                textView14.text=""
        }
    }
}