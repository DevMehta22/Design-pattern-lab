package Behavioral_Patterns.Decorator;

public class CountryDecoratedShape extends  cityDecorator {
    public CountryDecoratedShape(City decoratedCity) {
        super(decoratedCity);
    }
    public void State(){
        decoratedCity.State();
        System.out.println("Country: INDIA");
    }
}
