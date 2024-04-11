package Chapter2.Constructors

class MutableNameAlien(var name: String)
class FixedNameAlien(val name: String)

fun main() {
    val alien1 = MutableNameAlien("Reverse Giraff")
    val alien2 = FixedNameAlien("Krombopolis Michael")

    alien1.name = "Parasite"
    //다음과 같이 할 수는 없다.
    //alien2.name = "Parasite"
}