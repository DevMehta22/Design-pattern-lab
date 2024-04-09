package Behavioral_Patterns.State;

public class Mumbai implements CityState {
    @Override
    public void showInfo() {
        System.out.println("Mumbai: Financial capital of India");
    }
}