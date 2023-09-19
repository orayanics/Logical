package com.example.logical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.Arrays

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var stringLetters = ""
        var addNumbers = 0
        var stringNumbers = ""
        var resultNumbers = 0
        var finalResult = ""
        var finalResultNum = ""
        var subtractTotal = 0
        var addTotal = 0

        val btnA = findViewById<Button>(R.id.A);
        val btnB = findViewById<Button>(R.id.B);
        val btnC = findViewById<Button>(R.id.C);
        val btn1 = findViewById<Button>(R.id.n1);
        val btn2 = findViewById<Button>(R.id.n2);
        val btn3 = findViewById<Button>(R.id.n3);
        val btnAdd = findViewById<Button>(R.id.btnAdd);
        val btnMinus = findViewById<Button>(R.id.btnMinus);

        btnMinus.setOnClickListener{
            if(stringLetters.isNotEmpty() || !stringLetters.isNullOrEmpty()){
                stringLetters=stringLetters.substring(0,stringLetters.length-1)
                Toast.makeText(this, stringLetters, Toast.LENGTH_SHORT).show()
            }

            btn1.setOnClickListener {
                var btn1 = "1"
                var num1 = 1
                subtractTotal = addNumbers
                addNumbers -= num1;
                if(stringNumbers.isNotEmpty()){
                    if(stringNumbers.isNotEmpty() || !stringNumbers.isNullOrEmpty()){
                        stringNumbers = ""
                    }
                    resultNumbers = addNumbers
                    finalResultNum = subtractTotal.toString() + "-" + btn1 + "=" + addNumbers
                }
                else {
                    stringNumbers += btn1
                    finalResultNum = stringNumbers
                }

                Toast.makeText(this, finalResultNum, Toast.LENGTH_SHORT).show()
            }

            btn2.setOnClickListener {
                var btn2 = "2"
                var num2 = 2
                subtractTotal = addNumbers
                addNumbers -= num2;
                if(stringNumbers.isNotEmpty()){
                    if(stringNumbers.isNotEmpty() || !stringNumbers.isNullOrEmpty()){
                        stringNumbers = ""
                    }
                    resultNumbers = addNumbers
                    finalResultNum = subtractTotal.toString() + "-" + btn2 + "=" + addNumbers
                }
                else {
                    stringNumbers += btn1
                    finalResultNum = stringNumbers
                }

                Toast.makeText(this, finalResultNum, Toast.LENGTH_SHORT).show()
            }

            btn3.setOnClickListener {
                var btn3 = "3"
                var num3 = 3
                subtractTotal = addNumbers
                addNumbers -= num3;
                if(stringNumbers.isNotEmpty()){
                    if(stringNumbers.isNotEmpty() || !stringNumbers.isNullOrEmpty()){
                        stringNumbers = ""
                    }
                    resultNumbers = addNumbers
                    finalResultNum = subtractTotal.toString() + "-" + btn3 + "=" + addNumbers
                }
                else {
                    stringNumbers += btn1
                    finalResultNum = stringNumbers
                }

                Toast.makeText(this, finalResultNum, Toast.LENGTH_SHORT).show()
            }

        }

        btnAdd.setOnClickListener{
            btnA.setOnClickListener {
                var A = "A"
                stringLetters += A;
                Toast.makeText(this, stringLetters, Toast.LENGTH_SHORT).show()
            }

            btnB.setOnClickListener {
                var B = "B"
                stringLetters += B;
                Toast.makeText(this, stringLetters, Toast.LENGTH_SHORT).show()
            }

            btnC.setOnClickListener {
                var C = "C"
                stringLetters += C;
                Toast.makeText(this, stringLetters, Toast.LENGTH_SHORT).show()
            }

            btn1.setOnClickListener {
                var btn1 = "1"
                var num1 = 1
                addTotal = addNumbers
                addNumbers += num1;
                if(stringNumbers.isNotEmpty()){
                    resultNumbers = addNumbers
                    finalResultNum = addTotal.toString() + "+" + btn1 + "=" + addNumbers
                }
                else {
                    stringNumbers += btn1
                    finalResultNum = stringNumbers
                }

                Toast.makeText(this, finalResultNum, Toast.LENGTH_SHORT).show()
            }

            btn2.setOnClickListener {
                var btn2 = "2"
                var num2 = 2
                addTotal = addNumbers
                addNumbers += num2;
                if(stringNumbers.isNotEmpty()){
                    resultNumbers = addNumbers
                    finalResultNum = addTotal.toString() + "+" + btn2 + "=" + addNumbers
                }
                else {
                    stringNumbers += btn2
                    finalResultNum = stringNumbers
                }
                Toast.makeText(this, finalResultNum, Toast.LENGTH_SHORT).show()
            }

            btn3.setOnClickListener {
                var btn3 = "3"
                var num3 = 3
                addTotal = addNumbers
                addNumbers += num3;
                if(stringNumbers.isNotEmpty()){
                    resultNumbers = addNumbers
                    finalResultNum = addTotal.toString() + "+" + btn3 + "=" + addNumbers
                }
                else {
                    stringNumbers += btn3
                    finalResultNum = stringNumbers
                }
                Toast.makeText(this, finalResultNum, Toast.LENGTH_SHORT).show()
            }

        }



    }



}