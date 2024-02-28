package com.example.newkotlinbasics

fun main () {
//    val number1 : IntArray = intArrayOf(1,/2,3,4,5,6)

//    val number2 = intArrayOf(1,2,3,4,5,6)


    val numbers = arrayOf(1,2,3,4,5,6)
//    print(number1.contentToString())
//    print(number2.contentToString())
//    print("initial values${ numbers.contentToString() }")
//    for(element in numbers) {
//        print(" ${element + 2}")
//    }

    numbers[0] = 7
    numbers[1] = 8
    numbers[2] = 9
    numbers[3] = 10
    numbers[4] = 11
    numbers[5] = 12
//    print(" \n finals values${ numbers.contentToString() }")

val fruits = arrayOf(Fruit("apple", 10.9),Fruit("mango", 20.99),Fruit("orange", 30.99))
//print(fruits.contentToString())
//
    for(fruit in fruits) {
        print("${fruit.name}")
    }

    for (index in fruits.indices){
        print("${fruits[index].name} is in index $index")
    }


}

data class Fruit (val name: String, val price: Double)