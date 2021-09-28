package com.example.basickotlin.colation

fun main() {
    val capital = mapOf(
        "jakarta" to "Indonesia",
        "London" to "England",
        "New dhila" to "India"
    )
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amterdam"," Netherland")
    mutableCapital.put("Berlin"," Gremany")

    println(mutableCapital)
}