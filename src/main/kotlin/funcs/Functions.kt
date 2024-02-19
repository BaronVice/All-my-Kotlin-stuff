@file:JvmName("MyUtils")
package funcs

import things.TemperatureColor

fun max(a: Int, b: Int): Int = if (a > b) a else b
fun displayMax(a: Int, b: Int) /*: Unit - which is void */ {
    println(max(a, b))
}

fun answerChecker(string: String) =
    when (string){
        "y", "yes", "YES" -> "Nice"
        "n", "no", "NO" -> "OK"
        else -> "Weird"
    }

fun colorMixer(c1: TemperatureColor, c2: TemperatureColor) =
    when (setOf(c1,c2)){
        setOf(TemperatureColor.RED, TemperatureColor.BLUE) -> "Green"
        setOf(TemperatureColor.BLUE, TemperatureColor.ORANGE) -> "Brow"
        else -> throw Exception("Weird color")
    }

fun recognize(char: Char) =
    when (char) {
        in '0'..'9' -> "Digit"
        in 'a'..'z', in 'A'..'Z' -> "Letter"
        else -> "Werid char"
    }

@JvmOverloads
fun displayChars(char: Char = '*', int: Int = 10) {
    repeat(int){
        print(char)
    }
    println()
}
