package Behavioral_Patterns.Iterator;

public class IndianCityIterator implements CityIterator {
    private String[] cities;
    private int position;

    public IndianCityIterator(String[] cities) {
        this.cities = cities;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < cities.length;
    }

    @Override
    public String next() {
        if (hasNext()) {
            return cities[position++];
        }
        return null;
    }
}
