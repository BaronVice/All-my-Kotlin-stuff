package weirdthings

object WeatherUtil {
    fun update(degrees: Int): Pair<String, TemperatureColor> {
        return when {
            degrees > 25 -> Pair("hot", TemperatureColor.RED)
            degrees > 10 -> Pair("warm", TemperatureColor.ORANGE)
            else -> Pair("cold", TemperatureColor.BLUE)
        }
    }
}