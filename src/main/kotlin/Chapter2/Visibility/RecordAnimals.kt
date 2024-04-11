package Chapter2.Visibility

private var index = 0

private class Animal(val name: String)

private fun recordAnimal(
    animal: Animal
) {
    println("Animal #$index: ${animal.name}")
    index++
}

fun recordAnimals() {
    recordAnimal(Animal("Tiger"))
    recordAnimal(Animal("Antelope"))
}

fun recordAnimalCount() {
    println("$index animals are here!")
}