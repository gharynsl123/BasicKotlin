package com.example.basickotlin.colation

val masagge = { println("gharyn sinulingga") }
fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India",
    )

    println(capital["Jakarta"])
    val mapkeys = capital.keys
    val mapValeus = capital.values

    println(mapkeys)
    println(mapValeus)

    masagge()


}