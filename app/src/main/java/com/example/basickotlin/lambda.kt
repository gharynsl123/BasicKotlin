package com.example.basickotlin.colation

//mulai
fun main() {
    massagenul()
    printMassage("Gharyn SInulingga Sedang Belajar Lambda")

    val leght = massageLength("Hello From Lamdba")
    println("Massage Lebght  $leght")
}

//yang ini engga
val massagenul = { println("Gharyn SInulingga Sedang Belajar Lambda") }

// mantap Berhasil

//mulai lagi tapi menggunakan Parameter

val printMassage = { massage: String -> println(massage) }

//berhasil Lagi Mantap

//adalagi
val massageLength = {massage:String -> massage.length}