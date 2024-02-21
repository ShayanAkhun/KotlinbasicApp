package com.example.newkotlinbasics
 // base class super class or parent class
open class Car (val name: String, val brand : String) {
    //imhertited from vehical parent class
   open var range : Double = 0.0
     fun extendRange (amount : Double) {
         if(amount > 0)
              range += amount
     }
   open  fun drive (distance : Double) {
         println("Drove for $distance KM")
     }

     fun drive () {
         println("Drove for $range KM on electricity")
     }
}
class ElectriceCar(name: String, brand: String, batteryLife: Double) : Car(name, brand) {
    override var range = batteryLife * 6

    override fun drive (distance: Double) {
        println("drove for $distance on electricty")
    }
}
fun main () {
    var myCar = Car("911", "Porsche")
    var myEcar = ElectriceCar("S-Model", "Tesla", 85.0)

    myEcar.extendRange(300.0)
    myCar.drive(200.0)
    myEcar.drive(200.0)
    myEcar.drive()
}