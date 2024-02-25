package com.example.newkotlinbasics
 // base class super class or parent class

interface Driveable {
     val maxSpeed: Double
        fun drive() : String
        fun brake(){
            println("The driveable is braking ")
        }
}


open class Car (override val maxSpeed:Double, val name: String, val brand : String) : Driveable {
    //imhertited from vehical parent class
   open var range : Double = 0.0
     fun extendRange (amount : Double) {
         if(amount > 0)
              range += amount
     }
     override fun drive(): String {
        return "Driving the interface drive"
    }
     open fun drive (distance : Double) {
         println("Drove for $distance KM")
     }


}
class ElectriceCar(maxSpeed: Double,name: String, brand: String, batteryLife: Double) : Car(maxSpeed ,name, brand) {
    override var range = batteryLife * 6

    override fun drive (distance: Double) {
        println("drove for $distance on electricty")
    }
    override fun drive() : String {
        return "Drove for  $range KM on electricity"
    }

    override fun brake() {
        super.brake()
    }
}
fun main () {
    var myCar = Car(200.0,"A3", "Porsche")
    var myEcar = ElectriceCar(240.0,"S-Model", "Tesla", 85.0)


    myEcar.brake()
    myCar.brake()

//    myEcar.extendRange(300.0)
//    myCar.drive(200.0)
//    myEcar.drive(200.0)
//    myEcar.drive()
}