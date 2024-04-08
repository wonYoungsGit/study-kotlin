package Charter2.Visibility

class Counter(var start: Int) {
    fun increment() {
        start += 1
    }

    override fun toString() = start.toString()

}

class CounterHoler(counter: Counter) {
    private val ctr = counter
    override fun toString() = "CounterHolder: " + ctr
}

fun main() {
    val c = Counter(11)
    val ch = CounterHoler(c)
    println(ch)
    c.increment()
    println(ch)
    val ch2 = CounterHoler(Counter(9))
    println(ch2)
}