package com.example.summerpractice22


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.NullPointerException

class MainActivity : AppCompatActivity() {
    //Input data
    private var textPersonName: EditText? = null
    private var textPersonHeight: EditText? = null
    private var textPersonWeight: EditText? = null
    private var textPersonAge: EditText? = null

    //Buttons
    private var buttonZodiacSign: Button? = null

    //Output Text
    private var textView: TextView? = null


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textPersonName = findViewById(R.id.editTextTextPersonName)
        textPersonHeight = findViewById(R.id.editTextTextPersonName2)
        textPersonWeight = findViewById(R.id.editTextTextPersonName3)
        textPersonAge = findViewById(R.id.editTextTextPersonName4)

        //Buttons
        buttonZodiacSign = findViewById(R.id.button)

        //Output Text
        textView = findViewById(R.id.textView3)

        buttonZodiacSign?.setOnClickListener {
            var nameLength = 0
            var height = 0
            var weight = 0f
            var age = 0

            try {
                if (textPersonName!!.length() <= 50) {
                    nameLength = textPersonName!!.length()
                }

                if (textPersonHeight!!.text.toString().toInt() in 1..250){
                    height = textPersonHeight!!.text.toString().toInt()
                }

                if (textPersonWeight!!.text.toString().toFloat() > 0 && textPersonWeight!!.text.toString().toFloat() <= 250  ){
                    weight = textPersonWeight!!.text.toString().toFloat()
                }

                if (textPersonAge!!.text.toString().toInt() in 1..150){
                    age = textPersonAge!!.text.toString().toInt()
                }

                val znak = (nameLength + height + weight + age).toInt() %12
                val result = when {
                    znak <= 0 -> "Козерог"
                    znak == 1 -> "Водолей"
                    znak == 2 -> "Овен"
                    znak == 3 -> "Телец"
                    znak == 4 -> "Близнецы"
                    znak == 5 -> "Рак"
                    znak == 6 -> "Лев"
                    znak == 7 -> "Дева"
                    znak == 8 -> "Весы"
                    znak == 9 -> "Скорпион"
                    znak == 10 -> "Стрелец"
                    znak >= 11 -> "Рыба"
                    else -> {"Козерог"}
                }

                textView?.text = result

            } catch (e: NumberFormatException) {
                Toast.makeText(this, "POOOOOP", Toast.LENGTH_LONG)
                    .show()

            } catch (e: NullPointerException) {
                Toast.makeText(this, "POOOOOP", Toast.LENGTH_LONG)
                    .show()
            }
        }


    }

}