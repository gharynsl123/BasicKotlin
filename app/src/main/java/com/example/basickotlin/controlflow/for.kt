package com.example.basickotlin.controlflow

fun main (){
    val name = "yusril"

    for (name in name)
        println("\"$name\"")

    val range = 1.rangeTo(9)
    range.forEachIndexed{index, value -> println("$index bernilai $value")  }
}