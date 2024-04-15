package MVC_Pattern;

public class CityDemo {
    public static void main(String[] args) {
        CityModel model = retriveCityFromDatabase();
 
        CityView view = new CityView();
 
        CityControllers controller = new CityControllers(model, view);
 
        controller.updateView();
 
        controller.setCityName("Washington DC");
 
        controller.updateView();
    }
 
    private static CityModel retriveCityFromDatabase() {
        CityModel city = new CityModel();
        city.setName("New York");
        city.setCountry("United States");
        return city;
    }
}
