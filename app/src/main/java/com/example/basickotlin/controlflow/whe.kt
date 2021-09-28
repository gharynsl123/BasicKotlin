package com.example.basickotlin.controlflow

fun main(){
//    when
    var x = 0
    when (x) {
        1 -> println("X Itu ISI NYA SATU DODOL")
        2 -> println("EH TERNYATA ISINYA DUA")
        else -> {
            println("Isi nyA KOK KOSONG ??!")
        }
    }

    var nilaiAkhir = "c"

    when(nilaiAkhir) {
        "a", "b", "c" -> println ("kamu lulu Ujian Dengan Oredikan $nilaiAkhir")
        else ->{
            println("Kamu Jangan Mudah Menyerah Karena Menyerah Itu Enak")
        }
    }

//    when Exprixion With In
    val nilaiAkhirSemester = "a"
    val nilaiLulus = arrayOf("a","b", "c")
    when (nilaiAkhirSemester){
        in nilaiLulus -> println("Kamu Lulus Dengan Nilai $nilaiAkhirSemester")
        !in nilaiLulus -> println("Coba Lain Kali Ya")
    }

    val ujianPertengahan = 90
    when{
        ujianPertengahan >= 90 -> println("Anda Pelajar Yang Baik")
        ujianPertengahan >= 80 -> println("Nilai anda Cukup Baik")
        else -> println("Belajar Yang Bener Lagi Ya")
    }
}