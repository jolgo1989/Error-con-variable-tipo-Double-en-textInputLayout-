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


            if (!number1.isEmpty() || !number2.isEmpty()) {
                number1.error = "Digite numero"
                number2.error = "Digite numero"

            } else {
                val numberOne = number1.editText?.text.toString().toDouble()
                val numberTwo = number1.editText?.text.toString().toDouble()
                val resul = numberOne + numberTwo

                textView.text = resul.toString()

            }


        }


    }


}
