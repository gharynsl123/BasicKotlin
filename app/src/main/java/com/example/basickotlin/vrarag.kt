package com.example.basickotlin

fun main() {
    val number1 = intArrayOf(10,20,30,40)
    val number = sumNumbers(10, 20, 30 , 40 , 50, *number1)
    print(number)


    val arrayNumber = arrayOf(1, 2, 3, 4)
    println(sumNumbersArray(arrayNumber))
}

fun sumNumbers(vararg number : Int): Int{
    return number.sum()


}

fun sumNumbersArray(number: Array<Int>):Int {
    return number.sum()
}
