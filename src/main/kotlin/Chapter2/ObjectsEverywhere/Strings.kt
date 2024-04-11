package Chapter2.ObjectsEverywhere

import java.util.*

fun main() {
    val s = "AbcD"
    println(s.reversed())
    println(s.toLowerCase())
    println(s.lowercase())
    println(s.lowercase(Locale.getDefault()))
    println(Locale.getDefault())
}