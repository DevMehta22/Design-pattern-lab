package Structural_Patterns.FlyWeight;

public class IndianCity implements City{
    // intrinsic states
    private String CityName;
    private String Government;
    private String Climate;
    private int Population;

    //extrinsic States
    int cost_of_living;
    String Area_of_living;
    String ResidenceType;

    public IndianCity(String CityName, String Government, String Climate, int Population){
        this.CityName = CityName;
        this.Government = Government;
        this.Climate = Climate;
        this.Population = Population;
    }

    @Override
    public void showinfo(){
        System.out.println("CityName:"+CityName);
        System.out.println("Government: "+Government);
        System.out.println("CLimate:"+Climate);
        System.out.println("Population: "+Population+"\n");
    }

    public void setextrinsicState(int cost_of_living,String Area_of_living,String ResidenceType){
        this.cost_of_living=cost_of_living;
        this.Area_of_living=Area_of_living;
        this.ResidenceType=ResidenceType;
    }

    public void showextrinsicState(){
        System.out.println("Cost of living:"+cost_of_living);
        System.out.println("Area of living:"+Area_of_living);
        System.out.println("Residence Type:"+ResidenceType);
        
    }
}
