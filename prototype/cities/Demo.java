package prototype.cities;


public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException{
        State s = new State();
        s.loadData();
        s.setStateName("State 1");

        State s1 = (State)s.clone();
        s1.setStateName("State 2");

        s.getCities().remove(2);
        System.out.println(s); 
        System.out.println(s1);
    }
}
