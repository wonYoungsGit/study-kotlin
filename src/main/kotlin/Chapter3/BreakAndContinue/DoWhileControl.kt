import atomictest.eq

fun main() {
    val nums = mutableListOf(0)
    var i = 0
    do {
        i += 4
        if(i == 8) continue
        if(i == 40) break
        nums.add(i)
    } while (1 < 100)
    nums eq "[0, 4, 12, 16, 20, 24, 28, 32, 36]"
}