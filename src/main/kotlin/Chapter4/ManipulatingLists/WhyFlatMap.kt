package manipulatinglists
import atomictest.eq

class Book(
    val title: String,
    val author: List<String>
)

fun main() {
    val books = listOf(
        Book("1984", listOf("George Owell")),
        Book("Ulysses", listOf("James Joyce"))
    )

    books.map { it.author }.flatten() eq
        listOf("George Owell", "James Joyce")

    books.flatMap { it.author } eq
        listOf("George Owell", "James Joyce")
}