package area;

public class Rectangle implements Area {
    public void shape(){
        int l = 10;
        int b =5;
        double areaRectangle = l*b;
        System.out.println("The area of the rectangle is: " + areaRectangle);
    }
}
