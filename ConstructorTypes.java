public class ConstructorTypes {
    int a;
    // default constructor
    public ConstructorTypes() {
        System.out.println("Default constructor called.");
    }

    // parameterized constructor
    public ConstructorTypes(int a) {
        this.a = a;  
        System.out.println("Parameterized constructor called with value: " + a);
    }

    // copy constructor
    public ConstructorTypes(ConstructorTypes other) {
        System.out.println("Copy constructor called with value: " + other.a);
    }

    public static void main(String[] args) {
        // creating objects using different constructors
        ConstructorTypes obj1 = new ConstructorTypes();
        ConstructorTypes obj2 = new ConstructorTypes(10);
        ConstructorTypes obj3 = new ConstructorTypes(obj2);

    }
}
