package Structural_Patterns.FacadeCity;
import java.util.*;

public class facade_demo {
    public static void main(String[] args) {
        city_maker cityMaker = new city_maker();
        System.out.println("Enter the state:");
        Scanner sc = new Scanner(System.in);
        String state = sc.nextLine();
        if (state.equalsIgnoreCase("gujarat")) {
            cityMaker.GujaratCap();
        }else if(state.equalsIgnoreCase("maharashtra")){
            cityMaker.MaharashtraCap();
        }else if(state.equalsIgnoreCase("rajasthan")){
            cityMaker.RajasthanCap();
        }else{
            System.out.println("State not available as input");
        }
        sc.close();
    }
}
