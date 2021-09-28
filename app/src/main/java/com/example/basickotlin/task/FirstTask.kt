package com.example.basickotlin.task

fun main() {
    val jam = 42
    when (jam) {
        in 1..5 -> println("banya parkir sebanyak \$${jam + 1.0}")
        in 6..23 -> println("banya parkir sebanyak \$${((jam - 5.0) * 0.5) + 5}")
        else -> println("banyak parkir sebanyak \$${(jam % 24.0) * 0.5 + (jam / 24 * 15)}")
    }

}