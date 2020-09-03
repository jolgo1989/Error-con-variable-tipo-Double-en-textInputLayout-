package com.example.myapplicationsuma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {

           // opcion2()
           // opcion1()
            opcion3()


        }


    }

    fun opcion1() {
        val double = textInputLayout.editText?.text.toString().toDoubleOrNull()
        val double2 = textInputLayout2.editText?.text.toString().toDoubleOrNull()

        if (double != null) {
            //Double1 is a number
            textInputLayout.error = ""
        }
        if (double == null) {
            //Double1 is not a number
            textInputLayout.error = "Error"
            textView.text = ""
        }

        if (double2 != null) {
            //Double2 is a number
            textInputLayout2.error = ""
        }
        if (double2 == null) {
            //Double2 is not a number
            textInputLayout2.error = "Error"
            textView.text = ""
        }

        if (double != null && double2 != null) {
            textView.text = (double + double2).toString()
        }


    }
//Metodo con operador elvis
    fun opcion2() {

        val double: Double? = textInputLayout.editText?.text.toString().toDoubleOrNull()
        val double2: Double? = textInputLayout2.editText?.text.toString().toDoubleOrNull()

        double?.let {

            //double is a number ....
        } ?: (textInputLayout.setError("Error"))

        double2?.let {
            //Also double2 is a number ....
            if (double != null) {
                textView.text = (double + double2).toString()
            }
        } ?: (textInputLayout2.setError("Error"))


    }

    fun opcion3 (){

        val double: Double? = textInputLayout.editText?.text.toString().toDoubleOrNull()
        val double2: Double? = textInputLayout2.editText?.text.toString().toDoubleOrNull()

        if (double != null){
            //Double1 is a number
            textInputLayout.error = ""

        } else {
            //Double1 is not a number
            textInputLayout.error = "Error"
            textView.text = ""
        }

        if (double2 != null){
            //Double2 is a number
            textInputLayout2.error = ""
            if (double != null) {
                textView.text = (double+double2).toString()
            }
        } else {
            //Double2 is not a number
            textInputLayout2.error = "Error"
            textView.text = ""
        }
    }


}
