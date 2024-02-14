package Structural_Patterns.FacadeCity;



public class facade_demo {
    public static void main(String[] args) {
        city_maker cityMaker = new city_maker();
        cityMaker.GujaratCap();
        cityMaker.MaharashtraCap();
        cityMaker.RajasthanCap();

    }
}
