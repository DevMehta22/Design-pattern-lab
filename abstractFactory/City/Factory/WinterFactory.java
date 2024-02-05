package abstractFactory.City.Factory;

import abstractFactory.City.cityMethod.*;
public class WinterFactory extends AbstractFactory {
    public city getCity(String cityName){
        if (cityName.equalsIgnoreCase("Delhi")) {
            return new winterDelhi();
        }else if (cityName.equalsIgnoreCase("Mumbai")) {
            return new winterMumbai();
        }
        return null;
    }
}
