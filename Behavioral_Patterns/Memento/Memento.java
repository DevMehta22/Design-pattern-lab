package Behavioral_Patterns.Memento;
import java.util.ArrayList;
import java.util.List;

public class Memento {
    private List<String> savedCities;

    public Memento(List<String> cities) {
        savedCities = new ArrayList<>(cities);
    }

    public List<String> getSavedCities() {
        return savedCities;
    }   
}
