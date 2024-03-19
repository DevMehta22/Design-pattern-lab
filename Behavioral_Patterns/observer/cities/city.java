package Behavioral_Patterns.observer.cities;

import java.util.ArrayList;
import java.util.List;

public class city {
    private List<cityobserver> observer = new  ArrayList<>();
    String cityName;
    float temp;
    public city(String name){
        this.cityName=name; 
    }
    void registerStation(cityobserver o) {
        observer.add(o);
    }
    void removeStation(cityobserver o) {
        observer.remove(o);
    }
    void notifySations(){
        this.observer.forEach((cityobserver o)->o.update(this.cityName,this.temp));
    }
    public void setTemp(float t){
        this.temp = t;
        notifySations();
    }
}


