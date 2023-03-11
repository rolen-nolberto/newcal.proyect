package com.example.myproyectocalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    import java.util.Scanner

    fun main(args: Array<String>) {
        val reader = Scanner(System.`in`)
        print("1,2,3,4,5,6,7,8,9,0 ")
        val num1 = reader.nextDouble()
        print("1,2,3,4,5,6,7,8,9,0 ")
        val num2 = reader.nextDouble()
        println(" + o - ")
        val operator = reader.next()[0]
        val result = when (operator) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            else -> throw IllegalArgumentException("Operación no válida")
        }
        println("El resultado es $result")
    }

}
