package com.example.floatingtypes

fun main(){
    val circleRatio = 3.14
    println(circleRatio)

    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
// true
    println(myTrue && myFalse)
// false
    println(!myTrue)
// false
    println(boolNull)
// null

    //Tra apici singoli è un solo carattere
    val aChar = 'a'

    println(aChar)
    println('\n') // Prints an extra newline character
    println('\u00AE')

    var str = "abcd 123"
    str = "Giacomo"
    //equivalente a json
    println(str.lowercase())
    //concatenare
    println(str.lowercase() +" "+ "marongiu")
    println(str.lowercase() +"\n"+ "marongiu")

    //input
   // str = readln()
    println(str.lowercase() +" "+ "marongiu")

    var num = readln().toInt()
    if (num > 19){
        println("Entra ")
    } else if (num==18){
        println("entra ma stai attento")
    }else {
        println("non entri")
    }}