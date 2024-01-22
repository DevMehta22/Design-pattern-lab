package Cities;

public class info {
    public static void main(String[] args) {
        city c = new city_builder().setCityName("Mumbai").setState("Maharashtra").setCityPopulation(2169700).getCity();
        System.out.println(c);
    }   
}
