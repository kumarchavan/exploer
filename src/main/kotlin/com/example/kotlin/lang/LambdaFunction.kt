package com.example.kotlin.lang

import com.example.java.lang.Calculator
import com.example.java.lang.Task

fun LambdaFunction(iface: KotlinInterface) {
    iface.run("str")
}

fun interface KotlinInterface {
    fun run(str: String) : String
}

fun main() {
    val calc = Calculator(10, 5)

    //anonymous function
    val task = fun(a: Int, b: Int): Int { return a + b }
    println("task: ${task(2, 3)}")

    //anonymous object
    LambdaFunction(object : KotlinInterface {
        override fun run(str: String): String {
            print(str)
            return str
        }
    })


    //Lambda expression
    LambdaFunction { str ->
        print(str)
        ""
    }

    println("multiply: ${calc.execute { a, b -> a * b }}")

}