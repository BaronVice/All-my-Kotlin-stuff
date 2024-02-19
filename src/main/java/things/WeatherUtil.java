package things;

public final class WeatherUtil {
    public static void update(int degrees){
        String description;
        TemperatureColor color;

        if (degrees > 30){
            description = "hot";
            color = TemperatureColor.RED;
        } else if (degrees > 10) {
            description = "warm";
            color = TemperatureColor.ORANGE;
        } else {
            description = "cold";
            color = TemperatureColor.BLUE;
        }
    }
}
