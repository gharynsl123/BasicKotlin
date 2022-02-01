package com.example.basickotlin.oop

abstract  class Computer(){
    abstract fun operationSystem(): String
}

class Windows(): Computer(){
    override fun operationSystem(): String {
        return "Windows"
    }
}

class Mac(): Computer(){
    override fun operationSystem(): String {
        return "Mac"
    }
}

fun getOperatingSystem(computer: Computer) = computer.operationSystem()

fun main() {
    val windows = Windows()
    val mac = Mac()
    println(getOperatingSystem(windows))
    println()
    println(getOperatingSystem(mac))
}