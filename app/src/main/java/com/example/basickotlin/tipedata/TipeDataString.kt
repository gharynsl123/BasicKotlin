package com.example.basickotlin.tipedata

fun main() {
    val fName = "Gharyn"
    val lName = "Sinulingga"
    val alamatRumah = """
        Jalan Pejuang
        Perumahaan Duta Bumi 1 Blok E No 5 
        Kota Bekasi Barat, Harapan Indah
    """.trimIndent()

    println(fName)
    println(lName)
    println(alamatRumah)
//    trimMargin
    println(alamat())
//    groupin Item
    println(group())
//    Template Item
    println(tamplate())

}

fun alamat(): String{
    val alamatMargin = """
        |Jalan Pejuang
        Perumahaan Duta Bumi 1 Blok E No 5 
        |Kota Bekasi Barat, Harapan Indah
    """.trimMargin()
    return alamatMargin
}

fun group(): String{
    val fNameGroup = "Gharyn "
    val lNameGroup = "Gharyn"
    val fulName = fNameGroup +""+ lNameGroup

    return fulName
}

fun tamplate(): String {
    val firstName = "Ananda"
    val lassName = "gharyn"
    val fullName = "$firstName ${lassName.length}"
    return fullName
}