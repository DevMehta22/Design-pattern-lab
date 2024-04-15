package Behavioral_Patterns.Memento;

public class Demo {
    public static void main(String[] args) {
        Originator cityManager = new Originator();
        CareTaker cityHistory = new CareTaker();

        // Adding cities
        cityManager.addCity("Mumbai");
        cityManager.addCity("Delhi");
        cityManager.addCity("Bangalore");
        System.out.println("Current cities: " + cityManager.getCities());

        // Save state
        cityHistory.addMemento(cityManager.createMemento());

        // Adding another city
        cityManager.addCity("Kolkata");
        System.out.println("Current cities: " + cityManager.getCities());

        // Restore state
        cityManager.restoreFromMemento(cityHistory.getMemento(0));
        System.out.println("Restored cities: " + cityManager.getCities());
    }
}
