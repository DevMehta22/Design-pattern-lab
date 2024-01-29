package prototype.cities;
import java.util.ArrayList;
import java.util.List;



public class State implements Cloneable{
    private String StateName;
    private List<City> Cities = new ArrayList<>();
    public String  getStateName() { 
        return StateName;
    }
    public void setStateName(String StateName){
        this.StateName=StateName;
    }
    public List<City> getCities(){
        return  Cities;
    }
    public void setCities(List<City> Cities){
        this.Cities=Cities;
    }
    public void loadData(){
        for (int i = 0; i < 10; i++) {
            City c = new City();
            c.setCityCode(i);
            c.setCityName("City "+i);
            getCities().add(c);
        }
    }
    @Override
    public String toString(){
        return "State [StateName="+StateName+",cities="+Cities+"]";
    }
    @Override
    protected State clone() throws CloneNotSupportedException{
        State shop = new State();
        for(City b : this.getCities()){
            shop.getCities().add(b);
        }
        return shop;
    }
    
}
