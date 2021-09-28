package com.example.basickotlin

class Anime (val Judul : String, val Eps : Int){
    override fun toString(): String {
        return "DataAnimal(judul=$Judul, eps=$Eps)"
    }
}

data class DataAnimal(val name :String,val eps: Int)

fun main() {
//    val anime = Anime("Hai to Gensou no Grimgars2", 15)
    val dataAnimel = DataAnimal("Faiq Al ", 12)
    //equals
//    val anime4 = Anime("Faiq Al Harits", 20)

//    println(anime.equals(anime))
//    println(anime4.equals(anime4))
//    component
    val name = dataAnimel.component1()
    val age = dataAnimel.component2()
    println("$name Adalah Babi")
    println("$age adalah Umur Dari Variable DataAnime")

}