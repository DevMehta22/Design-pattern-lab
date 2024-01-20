package area;

public class Square implements Area {
    public void shape(){
        int side = 5;
        double areaSquare = side*side;
        System.out.println("This is a square with area " + areaSquare);
    }
}
