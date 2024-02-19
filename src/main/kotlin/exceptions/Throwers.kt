@file:JvmName("Exc")
package exceptions

import kotlin.random.Random

fun parseInt(string: String): Int? = try {
    Integer.parseInt(string)
} catch (e: NumberFormatException){
    null
}

// fun for sure
@Throws(IllegalArgumentException::class)
fun russianRoulette(){
    if (Random.nextInt(1, 7) == 6){
        throwIllegalArgumentException()
    } else {
        println("Nice!")
    }
}

private fun throwIllegalArgumentException(){
    throw IllegalArgumentException("Get REKT bozo")
}