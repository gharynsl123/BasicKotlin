package com.example.basickotlin.controlflow

fun main() {
    val gradeUjian = 85

    if (gradeUjian >= 90) {
        println("Kamu Mendapat Kan Nilai A+")
    }else if (gradeUjian >= 80) {
        println("Kamu Mendapat kan Nilai A-")
    }else{
        println("Kamu Belum Lulus. Coba Lagi Lain Kali")
    }
}