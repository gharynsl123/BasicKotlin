package com.example.basickotlin.controlflow

fun main(){
    val nilaiUjian = 50

    if (nilaiUjian == 90){
        println("Kamu Lulu Ujian. Perlu Latihan Lagi")
    }else if (nilaiUjian > 90){
        println("Kamu Lulus Dengan Nilai $nilaiUjian")
    }else{
        println("Kamu Gagal lulus. Karena Nilai KKM adalah 75. Nilai Kamu Adalah $nilaiUjian")
    }
}