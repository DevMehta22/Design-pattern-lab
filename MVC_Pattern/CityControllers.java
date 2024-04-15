package MVC_Pattern;

public class CityControllers {
    private CityModel model;
    private CityView  view;

    public CityControllers(CityModel  cityModel, CityView cityView) {
        this.model = cityModel;
        this.view = cityView;
    }

    public void setCityName(String name){
        model.setName(name);
    }
    public String getCityName(){
        return model.getName();
    }

    public void setCityCountry(String country){
        model.setName(country);
    }
    public String getCityCountry(){
        return model.getName();
    }

    public void updateView(){
        view.printStudentDetails(model.getName(), model.getCountry());
    }


}
