import atomictest.eq

fun main() {
    val returnTypeNullable: (String) -> Int? =
        { null }
    val mightBeNull: ((String) -> Int)? = null
    returnTypeNullable("abc") eq null
    //널검사를 하지않으면 컴파일이 되지 않는다
    //mightBeNull("abc")

    if(mightBeNull != null) {
        mightBeNull("abc")
    }
}