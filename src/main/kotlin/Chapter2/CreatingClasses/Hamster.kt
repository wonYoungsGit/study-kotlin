package Chapter2.CreatingClasses

class Hamster {
    fun speak() = "Squeak! "
    fun excercise() = this.speak() + //'this'로 한정함
            speak() + //'this' 없이 호출함
            "Running on wheel"
}

fun main() {
    val hamster = Hamster()
    println(hamster.excercise())
}