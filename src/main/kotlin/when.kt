package org.example

fun main() {
    // Write your code below

   println("Enter your time")

    // get the value into a variable
    val time = readlnOrNull()?.toInt()

    // When is like a switch in Java
    when {
        // Write your code below
        time in 0..11 -> println("Good morning")
        time in 12..16 -> println("Good afternoon")
        time in 17..23 -> println("Good evening")
        else -> println("Invalid time")
    }

}