package Behavioral_Patterns.observer.cities;

public class weatherstation implements cityobserver {
    String StationName;
    public weatherstation(String name){
        this.StationName = name;
    }
    public void update(String cityname,float temp){
        System.out.println(StationName+" reported: City "+cityname+"'s temperature is "+temp);
    }
}
