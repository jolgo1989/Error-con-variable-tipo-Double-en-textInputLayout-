package com.example.myapplicationsuma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isEmpty
import androidx.core.view.isNotEmpty
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.lang.NullPointerException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {

            opcion2()


        }


    }

    fun opcion1() {

        if (number1.isEmpty()) {
            number1.error = "Digite numero"

        }
        if (number2.isEmpty()) {
            number2.error = "Digite numero"
        }

        if (number1.isNotEmpty() || number2.isNotEmpty()) {
            val numberOne = number1.editText?.text.toString().toDouble()
            val numberTwo = number2.editText?.text.toString().toDouble()
            val resul = numberOne + numberTwo

            textView.text = resul.toString()

        }

    }

    fun opcion2() {

        val double: Double? = number1.editText?.text.toString().toDoubleOrNull()
        double?.let {
            // Number is double....

        } ?: (number1.setError("Enter number")  )

        val double2: Double? = number1.editText?.text.toString().toDoubleOrNull()
        double2?.let {
            // Number is double....
        } ?: (number2.setError("Enter number")  )
    }




}
