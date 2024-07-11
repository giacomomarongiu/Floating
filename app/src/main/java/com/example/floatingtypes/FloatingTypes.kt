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
}