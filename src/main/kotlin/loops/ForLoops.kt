@file:JvmName("Utils")
package loops

fun regularForLoop(){
    val list = listOf("a", "b", "c")
    // list.forEach(::print) is also an option, but we are here for loop
    for (el in list){
        print(el)
    }
    println()
}

fun mapLoop(){
    val map = mapOf(
        1 to "Afaf",
        2 to "Biba",
        3 to "Coco"
    )

    for ((k,v) in map){
        println("$k -> $v")
    }
}

fun forIndexing(){
    val a = listOf("a", "b", "c")
    a.withIndex().forEach { p -> println("${p.index} - ${p.value}") }
}

fun forRange(){
    val range: IntRange = 1..10
    for (i in range) println(i)
}

fun weirdForRange(){
    for (i in 10 downTo 1 step 2) println(i)
}
