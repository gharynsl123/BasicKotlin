package com.example.basickotlin.oop

class Human {
    //properties
    var mata = "normal"
    var mulut = true
    var telingga = 2
    var tangan : String? = "kuat"
    var kaki : Int? = 2
    //function
    fun melihat() { println("Melihat Dengan mata $mata") }
    fun berbicara() { println("Masih Bisa Berbicara ? Jawab = $mulut") }
    fun pendengaran() { println("Pendenganran Normal Dengan Adanya $telingga Telinga") }
    fun Mengangkat() { println("Angkat Lah Beban Dengan Tangan Yang $tangan") }
    fun jalan() { println("Berapa Kaki Manusia Normal ? Jawab = $kaki") }

}

fun main() {
    val programer = Human()

    programer.mata = "Harus Sehat"
    programer.kaki = null
    programer.tangan = "Tidak Bisa Menulis Dengan rapih"

    val pendaki = Human()
    pendaki.berbicara()
    pendaki.melihat()
    pendaki.jalan()
}