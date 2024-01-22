package Cities;

public class city {
    private String cityName;
    private String state;
    private double cityArea;
    private double cityPopulation;
    public city(String name, String st, double area, double pop){
        super();
        this.cityName=name;
        this.state =st;
        this.cityArea=area;
        this.cityPopulation=pop;
    }
    @Override
    public String toString(){
        return "City=[cityName:"+cityName+", state:"+state+", cityArea:"+cityArea+", cityPopulation:"+cityPopulation+"]";
    }
}
