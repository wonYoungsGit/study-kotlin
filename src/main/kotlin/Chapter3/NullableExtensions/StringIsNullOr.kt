import atomictest.eq

fun main() {
    val s1: String? = null
    s1.isNullOrEmpty() eq true
    s1.isNullOrBlank() eq true

    val s2 = ""
    s2.isNullOrEmpty() eq true
    s2.isNullOrBlank() eq true

    val s3: String = " \t\n"
    s3.isNullOrBlank() eq true
    s3.isNullOrEmpty() eq false

}
