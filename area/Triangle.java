package area;

public class Triangle implements Area {
    public void shape(){
        int b  = 15;
        int h = 12;
        double areaTriangle  = 0.5*b*h;
        System.out.println("The triangle's area is " + areaTriangle);
    }
}
