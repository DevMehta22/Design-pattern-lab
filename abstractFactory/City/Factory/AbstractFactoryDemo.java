package abstractFactory.City.Factory;
import java.util.*;

import abstractFactory.City.cityMethod.*;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the season(summer or winter):");
        String season = sc.nextLine();
        AbstractFactory cityFactory = FactoryProducer.getFactory(season);
        System.out.println("Enter the city(Delhi or Mumbai):");
        String City = sc.nextLine();
        city cityName = cityFactory.getCity(City);
        cityName.cities();
        sc.close();
    }   
}
