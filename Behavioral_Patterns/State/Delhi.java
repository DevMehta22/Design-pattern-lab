package Behavioral_Patterns.State;

public class Delhi implements CityState {
    @Override
    public void showInfo() {
        System.out.println("Delhi: Capital city of India");
    }
}