package com.example.basickotlin.oop

class mahasiswa {
    private var nama = String()
    fun setNama(nama :String){
        this.nama = nama
    }
    fun getNama() : String = nama
}

fun main(){
    val mhs1 = mahasiswa()
    mhs1.setNama("Bang Jali")

    println("Hai.., Saya ${mhs1.getNama()}")
    println("Salam Kenal")
}