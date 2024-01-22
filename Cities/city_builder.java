package Cities;

public class city_builder {
    private String cityName;
    private String state;
    private double cityArea;
    private double cityPopulation;

    public city_builder setCityName(String cityName) {
        this.cityName = cityName;
        return this;
    }

    public city_builder setState(String state) {
        this.state = state;
        return this;
    }
  
    public city_builder setCityArea(double cityArea) {
        this.cityArea = cityArea;
        return this;
    }

    public city_builder setCityPopulation(double cityPopulation) {
        this.cityPopulation = cityPopulation;
        return this;
    }

    public city getCity(){
        return new city(cityName,state,cityArea,cityPopulation);
    }
}
