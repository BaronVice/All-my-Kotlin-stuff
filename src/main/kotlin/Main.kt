
import exceptions.parseInt
import exceptions.russianRoulette
import extensionfuncs.plus
import funcs.displayChars
import funcs.displayMax
import smartcast.Dog
import smartcast.Example
import things.Person
import weirdthings.BetterPerson
import weirdthings.WeatherUtil

fun main(args: Array<String>) {
    val person = Person("BV", 21)
    val betterPerson = BetterPerson("BV", 21)
    println(person)
    println(betterPerson)
    println(WeatherUtil.update(15))
    println("Hello ${args.getOrElse(0) { "Kotlin" }}!")
    displayMax(1000, Int.MAX_VALUE)
    displayChars(int = 100, char = '-')

    Example.petSound(Dog("Simon"))

    repeat(2){
        russianRoulette()
    }
    println(parseInt("-12f3"))
    val a = 21
    val b: Int? = null
    a.plus(b)
    println(a)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}