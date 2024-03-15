package org.example

fun Incrementing(start: Int?, end: Int?) {
    // if the start and end are not null
    if (start != null && end != null) {

        // our arrays
        val numbers = mutableListOf<Int>()

        // range from start to end
        // we are using range here like the dots in python
        val range = start..end

        // then check the range
        for (i in range){

            // then enter the number base on start and end
            println("Enter your number$i")

            // store the value in a variable
            val number = readlnOrNull()?.toInt()

            // if the number is not null
            if (number != null) {
                numbers.add(number)
            }


        }

        // print the numbers
        for (i in numbers){
            println("The number is $i")
        }
    }

}

fun main(){

    // ask the user to print the start range
    println("Enter your start range")

    // store the value in a variable
    val start = readlnOrNull()?.toInt()

    // ask the user the end range
    println("Enter your end range")

    // store the value in a variable
    val end = readlnOrNull()?.toInt()

    // call the method
    Incrementing(start, end )



}