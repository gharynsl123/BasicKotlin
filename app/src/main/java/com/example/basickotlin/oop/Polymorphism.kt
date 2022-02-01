package com.example.basickotlin.oop

open class Animall{
    open fun sound(){
        println("Berbagai macam suara Binatang")
    }
}

class  subaru : Animall(){
    override fun sound() {
        println("Suara Bebek : WEK WEK WEK WEK WEK")
    }
}

class okayou : Animall(){
    override fun sound() {
        println("Suara Kucing : MOEW MOEW MOEW MOEW MOEW MOEW")
    }
}

fun main() {
    val hewan = Animall()
    val bebek = subaru()
    val kucing = okayou()

    hewan.sound()
    bebek.sound()
    kucing.sound()
}