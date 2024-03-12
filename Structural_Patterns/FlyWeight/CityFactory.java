package Structural_Patterns.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class CityFactory {
    private static final Map<String, City> cityMap = new HashMap<>();
    public static City getCity(String CityName, String Government, String Climate, int Population,int cost_of_living,String Area_of_living,String ResidenceType) {
        City city = cityMap.get(CityName);

        if (city == null) {
            city = new IndianCity(CityName,Government,Climate,Population);
            city.setextrinsicState(cost_of_living,Area_of_living,ResidenceType);
            cityMap.put(CityName, city);
        }

        return city;
    }
}

