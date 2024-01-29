package prototype.cities;

public class City {
    private int CityCode;
    private String CityName;

    public int getCityCode() {
        return this.CityCode;
    }

    public void setCityCode(int CityCode) {
        this.CityCode = CityCode;
    }

    public String getCityName() {
        return this.CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }
    @Override
    public String toString(){
        return "City [CityCode=" + CityCode + ", CityName=" + CityName + "]";
    }

}
