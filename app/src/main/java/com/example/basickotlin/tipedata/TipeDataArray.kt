package com.example.basickotlin.tipedata

fun main() {
    val friends : Array<String> = arrayOf("Gharyn", "Dias", "Nanda", "Lord Daffa", "Dimkey", "Altaf", "DLL")
    val age : Array<Int> = arrayOf(15, 15, 15, 15, 15, 15, 15)

    for (i in friends){
        println(i)
    }

    for (a in age){
        println(a)
    }

    val name : Array<String?> = arrayOfNulls(2)
    name.set(0,null)
    name.set(0,null)

    for (b in name){
        println(b)
    }

    println(friends[1])
    println(friends.get(0))

    friends.set(0,"thaariq")
    println(friends[0])
}