package other
import atomictest.eq
import extensionfunctions.*

fun main() {
    "Single".singleQuote() eq "'Single'"
    "Double".doubleQuote() eq "\"Double\""
}

