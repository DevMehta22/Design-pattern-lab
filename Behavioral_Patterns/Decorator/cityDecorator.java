package Behavioral_Patterns.Decorator;

public abstract class cityDecorator implements City {
    protected  City decoratedCity;
    public cityDecorator(City city){
        this.decoratedCity = city;
    }
    public void State(){
        decoratedCity.State();
    }

}
