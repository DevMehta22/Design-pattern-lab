package Structural_Patterns.FlyWeight;

public class CityDemo {
    public static void main(String[] args) {
        City person1 = CityFactory.getCity("Delhi","AAP","Humid",50000000,40000,"Noida","Apartment");
        City person2 = CityFactory.getCity("Delhi","AAP","Humid",50000000,30000,"Shivnagar","flat");
        City person3 = CityFactory.getCity("Mumbai","Shiv Sena","Dry",70000000,80000,"Borivali","flat");
        City person4 = CityFactory.getCity("Mumbai","Shiv Sena","Dry",70000000,100000,"kandivali","flat");

        person1.showinfo();
        person1.showextrinsicState();
        person2.showinfo();
        person2.showextrinsicState();
        person3.showinfo();
        person3.showextrinsicState();
        person4.showinfo();
        person4.showextrinsicState();
    }
}
