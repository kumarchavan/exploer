package com.example.kotlin.lang

//returning function
fun getfunction(funName: String): (Int, Int) -> Long {
    return when(funName) {
        "add" -> ::sum
        "sub" -> ::subStraction
        else -> {a, b -> (a/b).toLong()}
    }
}

//Taking function as a parameter
fun stringCaculator(x: String, y: String, operation: (Int, Int) -> Long): Long {
    val _x: Int = when(x) {
        "one" -> 1
        "two" -> 2
        "ten" -> 10
        else -> 0
    }

    val _y: Int = when(y) {
        "one" -> 1
        "two" -> 2
        "ten" -> 10
        else -> 0
    }
    return operation(_x, _y)
}

fun sum(x: Int, y: Int): Long { return (x + y).toLong()
}

fun subStraction(x: Int, y: Int): Long { return (x - y).toLong() }

fun main() {
    //function pointer - ::
    val sumResult = stringCaculator("two", "ten", ::sum)
    val subResult = stringCaculator("two", "ten", getfunction("sub"))
    val divResult = stringCaculator("two", "ten", getfunction("div"))
    val mulResult = stringCaculator("two", "ten") { a, b -> (a * b).toLong() }

    println("sumResult: $sumResult")
    println("subResult: $subResult")
    println("diivResult: $divResult")
    println("mulResult: $mulResult")

    Thread {
        print("run function ${java.lang.Thread.currentThread().state}")
    }.start()
}

