package Behavioral_Patterns.Memento;

import java.util.ArrayList;
import java.util.List;

public class Originator {
    private List<String> cities = new ArrayList<>();

    public void addCity(String city) {
        cities.add(city);
    }

    public List<String> getCities() {
        return new ArrayList<>(cities);
    }

    public Memento createMemento() {
        return new Memento(getCities());
    }

    public void restoreFromMemento(Memento memento) {
        cities = memento.getSavedCities();
    }
}
