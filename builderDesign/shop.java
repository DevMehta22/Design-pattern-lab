package builderDesign;

public class shop{
    public static void main(String[] args) {
        phone p = new phone_builder().setOs("Android").setRam(8).setBattery(2500).getPhone();
        System.out.println(p);

    }
}

