package com.example.kotlin.lang

data class Employee (val empId: Int, val name: String, var address: String?) {
    override fun toString(): String {
        return super.toString()
    }
}


fun main() {
    val emp1 = Employee(1, "kumar", "Dublin")
    val emp2 = Employee(1, "kumar", "")
    println("ToString(): $emp1")
    println("equals(): ${emp1 == emp2}")
}