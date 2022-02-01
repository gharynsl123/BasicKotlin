package com.example.basickotlin
// Clas Merupakan Sebuah Blueprint Yang terdapat Properti Dan Funsi Di Dalam nya

//constraktor Merupakan Semua Variable Yang ada DI dalam Class
//Properti Merupakan Variable Di Dalam Constraktor

class Animal(val name: String,
             val weight: Double,
             val age: Int,
             val isMammal: Boolean,
             val spesies: String) {

    //Function

    var warna = "kuning"

    fun eat(){
        println("$name makan !")
    }

    fun sleep () {
        println("$name Tidur !")
    }
}

fun main() {
    val faiq = Animal("Faiq", 27.5, 10000, true, "Merah Langka")
    val Thaariq = Animal("Thaariq", 10000.5, 10, false, "SAGAPUNG")
    val ahsan = Animal("ahsan", 1.5, 50, false, "Langkah")
    val Dzaki = Animal("Dzaki", 0.5, 5, true, "SAGAPUNG")

    /*println("Nama : ${faiq.name}," +
            "\nBerat : ${faiq.weight}," +
            "\nUmur : ${faiq.age}," +
            "\nMamalia : ${faiq.isMammal}," +
            "\nSepsies : ${faiq.spesies}"
    )*/

    faiq.warna = "Coklat"
    println("Thariq Warna ${faiq.warna}")

    println("\n\n")
    faiq.eat()
    faiq.sleep()

}


