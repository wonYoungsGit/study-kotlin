import atomictest.*

fun main() {
    val v1 = 11
    val v2 = "Ontology"

    // 'eq'는 '같다'는 뜻
    v1 eq 11
    v2 eq "Ontology"

    //'neq'는 '같지않다'는 뜻
    v2 neq "Epistimology"

    //[Error] Epistimology != Ontology
    //v2 eq "Epistimology"


}

