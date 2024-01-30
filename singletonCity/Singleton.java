package singletonCity;

enum City{
    INSTANCE;
    private City() {
        System.out.println("Hello Enum Singleton Created!");
    }
    String i;
    public void show(){
        System.out.println("Value of I : "+i);
    }
    
}
public class Singleton {
    public static void main(String[] args) {
        // 1st way to create object using method reference
        City c1 = City.INSTANCE;
        c1.i="Mumbai";
        c1.show();
        City c2 = City.INSTANCE;
        c2.i = "Delhi";
        c1.show();
    }
    
}
