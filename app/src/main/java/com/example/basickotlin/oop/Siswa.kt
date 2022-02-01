package com.example.basickotlin.oop

open class Siswa(val nama: String, val berat: Float) {
    fun info() {
        println(
            "Nama: $nama" +
                    "Berat: $berat"
        )
    }
}

class SiswaIdn(nama: String, berat: Float, val jenis: String, val asal: String):Siswa(nama, berat)

fun main() {
    val pelajar = SiswaIdn("Armand", 50.0F, "NU","USA")
    println("Nama Siswa : ${pelajar.nama}")
    println("Jenis Siswa : ${pelajar.jenis}")
    println("Asal Siswa : ${pelajar.asal}")
    println("Berat Siswa : ${pelajar.berat}")
}