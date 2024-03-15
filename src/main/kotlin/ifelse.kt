package org.example

fun main() {

    println("Enter your age:")
    val age = readlnOrNull()?.toInt()
    if (age != null) {
        if(age>=18){
            println("You are an adult")

        }
        else if (age>=13){
            println("You are a teenager")
        }
        else{
            println("You are a child")
        }
    }

}