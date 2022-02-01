package com.example.basickotlin

open class Person(val name: String, val email: String) {
    fun info() {
        println("Name : $name\nEmail : $email")
    }
}

open class Teacher(name: String, email: String, val subject: String) : Person(name, email) {
    fun specialSubject() {
        info()
        println("Is a teacher who teaches subject $subject.")
    }
}

class PrivateTeacher(name: String, email: String, subject: String, val student: Int) :
    Teacher(name, email, subject) {
    fun capacity() {
        specialSubject()
        println("As a Private Teacher able to teach $student students.")
    }
}

class PublicTeacher(name: String, email: String, subject: String, val school: String):
        Teacher(name, email, subject){
            fun school(){
                specialSubject()
                println("Teaching at $school as a public teacher.")
            }
        }

fun main(){
    val myTeacher = PrivateTeacher("Pak Somat", "ajinsumarudin@gmail.com", "Full Stack Programing", 50, )
    myTeacher.capacity()

//    println(myTeacher)
}