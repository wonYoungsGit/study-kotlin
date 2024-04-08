package extensionfunctions

import atomictest.eq

// singleQuote()를 두 번 적용해서 작은 따옴표를 두 개 붙인다
fun String.strangeQuote() = this.singleQuote().singleQuote() //[1]
fun String.tooManyQuote() = doubleQuote().doubleQuote() //[2]

fun main() {
    "Hi".strangeQuote() eq "''Hi''"
    "Hi".tooManyQuote() eq "\"\"Hi\"\""
}

