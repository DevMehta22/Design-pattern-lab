package abstractFactory.City.Factory;

import abstractFactory.City.cityMethod.*;

public class SummerFactory extends AbstractFactory{
     public city getCity(String cityName){
        if (cityName.equalsIgnoreCase("Delhi")) {
            return new summerDelhi();
        }else if (cityName.equalsIgnoreCase("Mumbai")) {
            return new summerMumbai();
        }
        return null;
    }
}

