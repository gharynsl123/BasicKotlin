package com.example.basickotlin.colation

fun main() {
    val integerSet = setOf(1, 2, 3, 4, 1, 2, 3, 4)
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)
}