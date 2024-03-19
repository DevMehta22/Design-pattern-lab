package Behavioral_Patterns.observer.cities;

public class cityDemo {
    public static void main(String[] args) {
        city City1 = new city("Mumbai");
        city City2 = new city("Delhi");
        weatherstation ws1 = new weatherstation("Station 1");
        weatherstation ws2 = new weatherstation("Station 2");
        City1.registerStation(ws1);
        City1.registerStation(ws2);
        City2.registerStation(ws1);

        City1.setTemp(24);
        City2.setTemp(30);
    }
}
