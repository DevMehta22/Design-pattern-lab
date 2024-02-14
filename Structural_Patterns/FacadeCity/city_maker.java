package Structural_Patterns.FacadeCity;



public class city_maker {
    private City Gujarat;
    private City Maharashtra;
    private City Rajasthan;
    public city_maker() {
        Gujarat = new Gujarat() ;
        Maharashtra = new Maharashtra();
        Rajasthan = new Rajasthan();
    }

public void GujaratCap(){
    Gujarat.city();
}
public void MaharashtraCap(){
    Maharashtra.city();
}
public void RajasthanCap(){
    Rajasthan.city();
}
}
