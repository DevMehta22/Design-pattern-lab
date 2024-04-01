package Behavioral_Patterns.Decorator;

public class Demo {
    public static void main(String[] args) {
        City mumbai = new Mumbai();
        City CountryMumbai = new CountryDecoratedShape(new Mumbai());
        City CountryDelhi = new CountryDecoratedShape(new Delhi());
        System.out.println("Initial City");
        mumbai.State();
        System.out.println("\nCity in Country");
        CountryMumbai.State();
        CountryDelhi.State();

    }
}
