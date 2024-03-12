package Structural_Patterns.AdapterDesign;

public class WeatherAPI extends GovCityInfo implements City {
    public void CityInfo(){
        setCityName("Mumbai");
        setCityPopulation(50000000);
        setCityArea(60000000.00);
    }

    public String getWeather(){
        String cityName = getCityName();
        int CityPopulation = getCityPopulation();
        String Weather = "30 C";

        return  ("The weather in "+cityName+", with a population of "+CityPopulation+"is "+Weather);
    }
}
