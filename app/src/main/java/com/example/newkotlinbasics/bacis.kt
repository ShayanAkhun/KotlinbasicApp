package com.example.newkotlinbasics




data class User (val id :Long, val name : String)
fun main() {



    val user1= User(1, "shayan")

    val name = user1.name
    println(name)




}

