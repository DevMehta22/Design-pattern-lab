package Behavioral_Patterns.State;


public class City_demo {
    public static void main(String[] args) {
        Context context = new Context();

        context.setState(new Mumbai());
        context.showInfo();

        context.setState(new Delhi());
        context.showInfo();

        context.setState(new Manali());
        context.showInfo();
    }
}
