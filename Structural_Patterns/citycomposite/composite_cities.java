package Structural_Patterns.citycomposite;

import java.util.ArrayList;

interface City{
    void showCity();
}

class Leaf implements City{
    String cityName;
    double population;

    public Leaf(String cityName,double population){
        super();
        this.cityName = cityName;
        this.population=population;
    }
    @Override
    public void showCity(){
        System.out.println("I am a leaf, I am "+cityName+" and my population is "+population);
    }
}

class Composite implements City{
    String cityName;
    ArrayList<City> components=new ArrayList<>();
    public Composite(String cityName) {
        super();
        this.cityName = cityName;
    }
    public void add(City com){
        components.add(com);
    }
    @Override
    public void showCity() {
        System.out.println(cityName);
        for(City c:components){
            c.showCity();
        }
    }

}

