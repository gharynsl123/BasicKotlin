package com.example.basickotlin.colation

fun main() {
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setC = setOf(1,5,7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)


    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    mutableSet.add(6)
    mutableSet.remove(1)
    println(mutableSet)
}

