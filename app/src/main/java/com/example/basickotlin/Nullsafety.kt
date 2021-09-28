package com.example.basickotlin

fun main() {
//    Membuat Null Dan Melakukan Pengecekan Dengan If else
    /*val b = 12
    if (b != null){
        print(b)
    }else{
        print("variable b adalah null")
    }*/
    var c : String? = null
    println(c?.length)

    val d : String? = "sinulingga"
    if (d != null){
      print(d.length)
    }else{
        println(-1)
    }
//    elvis operator
    val l = d?.length ?: -1
    println(l)

    //!! Operator
    val s : String? = null
    println(s!!.length)

}