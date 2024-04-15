package Behavioral_Patterns.Iterator;

public class CityDemo {
    public static void main(String[] args) {
        CityCollection cityCollection = new IndianCityCollection();
        CityIterator iterator = cityCollection.getIterator();

        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println("City: " + city);
        }
    }   
}
