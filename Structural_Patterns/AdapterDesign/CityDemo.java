package Structural_Patterns.AdapterDesign;

public class CityDemo {
    public static void main(String[] args) {
        City targetInterface = new WeatherAPI();
        targetInterface.CityInfo();
        System.out.println(targetInterface.getWeather());
    }
}
