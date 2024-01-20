package area;

public class Circle implements Area {

    public void shape(){
        int r = 10;
        double areaCircle = Math.PI * (r*r);
        System.out.println("This is a circle with radius " + r + ", and its area is " + areaCircle);
    }
}
