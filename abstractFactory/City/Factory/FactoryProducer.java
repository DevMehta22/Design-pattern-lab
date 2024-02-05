package abstractFactory.City.Factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String season){
        if (season.equalsIgnoreCase("winter")) {
            return new WinterFactory();
        }else if(season.equalsIgnoreCase("summer")){
            return new SummerFactory();
        }
        return null;
    } 
}
