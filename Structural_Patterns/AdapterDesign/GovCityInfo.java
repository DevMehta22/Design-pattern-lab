package Structural_Patterns.AdapterDesign;

public class GovCityInfo {
    private String CityName;
    private int CityPopulation;
    private double CityArea;

    public String getCityName() {
        return this.CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public int getCityPopulation() {
        return this.CityPopulation;
    }

    public void setCityPopulation(int CityPopulation) {
        this.CityPopulation = CityPopulation;
    }

    public double getCityArea() {
        return CityArea;
    }

    public  void setCityArea(double cityArea) {
        this.CityArea=cityArea;
    }

}
