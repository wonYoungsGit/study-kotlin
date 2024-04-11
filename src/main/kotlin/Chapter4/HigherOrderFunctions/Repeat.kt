package higherorderfunctions

import atomictest.*

fun repeat(
    times: Int,
    action: (Int) -> Unit
) {
    for (index in 0 until times) {
        action(index)
    }
}

fun main() {
    repeat(3) { trace("#$it") }
    trace eq "#0 #1 #2"
}