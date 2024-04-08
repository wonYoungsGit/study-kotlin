package Charter2.Visibility

class Cookie (
    private var isReady: Boolean
) {
    private fun crumble() = println("crumble")
    public fun bite() = println("bite")

    fun eat() {
        isReady = true
        crumble()
        bite()
    }
}

fun main() {
    val x = Cookie(false)
    x.bite()
    //private 멤버에 접근할 수 없다
    //x.isReady
    //x.crumble()
    x.eat()
}