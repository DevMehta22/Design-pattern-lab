package Behavioral_Patterns.State;


public class Context {
    private CityState currenState;

    public Context(){
        currenState = new Ahmedabad();
    }

    public void setState(CityState state){
        this.currenState = state;
    }

    public void showInfo(){
        currenState.showInfo();
    }
}
