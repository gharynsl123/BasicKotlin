package com.example.basickotlin.oop

class Hewan (name: String, berat :Float, berbulu: Boolean, umur : Int) {
    val name :String = name
    val berat: Float = if (berat <= 0) 0.1F else berat
    val berbulu : Boolean = berbulu
    val umur: Int? = null

    fun info (){
        println("Nama : $name \nBerat : $berat \nHewan Berbulu : $berbulu\nUmur : $umur")
    }
}

fun main() {
    val beta = Hewan("Yama", 35.1F, true, 2)
    beta.info()

    val namaPanjang = beta.name.length
    val berat = beta.berat.toDouble()
    val berbulu = beta.berbulu.not()
    val umur = beta.umur?.plus(1)

}