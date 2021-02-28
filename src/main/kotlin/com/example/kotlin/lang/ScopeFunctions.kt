package com.example.kotlin.lang
fun runExample(ns: String?) {
    println("for \"$ns\":")
    ns?.run {                                                  // 1
        println("\tis empty? " + isEmpty())                    // 2
        println("\tlength = $length")
        length                                                 // 3
    }
}

fun letExample(str: String) {
    println("Let string: $str ${str.length}")
}

fun someFunction(a: Int): String? {
    return if (a == 1) {
        null
    } else {
        "asd"
    }
}

fun withExample() {
    val emp = Employee(1, "kumar", "Dublin")
    //without with
    println("Employee details ${emp.name} ${emp.empId}")

    //with
    with(emp) {
        println("Employee details $name $empId")
    }

}

fun main() {
    //let
    val str: String? = someFunction(2)
    str?.let { letExample(it) }

    //Run
    runExample(null)
    runExample("")
    runExample("some string with Kotlin")

    //with

}