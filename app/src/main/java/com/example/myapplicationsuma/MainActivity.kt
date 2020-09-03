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

            //  opcion2()
            opcion1()


        }


    }

    fun opcion1() {
        val double: Double? = number1.editText?.text.toString().toDoubleOrNull()
        val double2: Double? = number2.editText?.text.toString().toDoubleOrNull()


        if (double != null) {
            //Double1 is a number
            number1.error = ""
        }
        if (double == null) {
            //Double1 is not a number
            number1.error = "Error"
            textView.text = ""
        }

        if (double2 != null) {
            //Double2 is a number
            number2.error = ""

        }
        if (double2 == null) {
            //Double2 is not a number
            number2.error = "Error"
            textView.text = ""
        }

        if (double != null && double2 != null) {
            textView.text = (double + double2).toString()
        }


    }

    fun opcion2() {

        val double: Double? = number1.editText?.text.toString().toDoubleOrNull()
        val double2: Double? = number2.editText?.text.toString().toDoubleOrNull()

        double?.let {

            //double is a number ....
        } ?: (number1.setError("Error"))

        double2?.let {
            //Also double2 is a number ....
            if (double != null) {
                textView.text = (double + double2).toString()
            }
        } ?: (number2.setError("Error"))


    }


}
