package Behavioral_Patterns.Iterator;

public class IndianCityCollection implements CityCollection {
    private String[] cities;

    public IndianCityCollection() {
        // Initialize with some Indian cities
        this.cities = new String[]{"Delhi", "Mumbai", "Chennai", "Kolkata", "Bangalore"};
    }

    @Override
    public CityIterator getIterator() {
        return new IndianCityIterator(cities);
    }
}