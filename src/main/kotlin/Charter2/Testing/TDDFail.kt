package testing1

import atomictest.*

fun main(){
    calculateBMI(160,68) eq "Normal weight"
    calculateBMI(100,68) eq "Underweight"
    calculateBMI(160,68) eq "Overweight"
}

fun calculateBMI(weight: Int, height: Int) = "Normal weight"