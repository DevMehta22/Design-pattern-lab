package cityInfo;

public class cityFactory {
    public State getInstance(String str){
        if (str.equalsIgnoreCase("Delhi")){
            return new Delhi();
            }
        else if (str.equalsIgnoreCase("Mumbai")){
            return new Mumbai();
            }
        else if (str.equalsIgnoreCase("Ahmedabad")){
            return new Ahmedabad();
            } 
        else if (str.equalsIgnoreCase("Jaipur")){
            return new Jaipur();
            }else{
                System.out.println("Invalid City Name");
                return null;
            }   
    }   
}
