package com.example.basickotlin.colation

fun main() {
    val anyList = mutableListOf('a', "kotlin", 3, true)

    anyList.add('d')//Menambah kan 1 Item Di akhir
    println(anyList)

    anyList.add(1, "My")//Menmabahkan Item pada Indeks Ke 2
    println(anyList)

    anyList[3] = false //mengubah nilai item pada indeks ke 3
    println(anyList)

    anyList.removeAt(1)//mengbah item yang di tunjukan di index
    println(anyList)
}