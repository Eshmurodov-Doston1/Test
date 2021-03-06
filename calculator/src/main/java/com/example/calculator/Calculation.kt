package com.example.calculator

import android.content.Context
import android.widget.Toast

class Calculation {
    companion object {
        fun plus(context: Context,a: Int, b: Int): Int {
            Toast.makeText(context, "${a + b}", Toast.LENGTH_SHORT).show()
            return a + b
        }
        fun minus(context: Context,a: Int, b: Int): Int {
            Toast.makeText(context, "${a - b}", Toast.LENGTH_SHORT).show()
            return a - b
        }
        fun divide(context: Context,a: Int, b: Int): Int {
            require(b!=0){"Divide by zero Error"}
            Toast.makeText(context, "${a/b}", Toast.LENGTH_SHORT).show()
            return a / b
        }
        fun multiply(context: Context,a: Int, b: Int): Int {
            Toast.makeText(context, "${a*b}", Toast.LENGTH_SHORT).show()
            return a * b
        }
    }
}