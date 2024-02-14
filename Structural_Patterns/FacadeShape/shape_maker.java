package Structural_Patterns.FacadeShape;

public class shape_maker {
    private shape circle;
    private shape rectangle;
    private shape square;
    public shape_maker() {
        circle = new circle() ;
        rectangle = new rectangle();
        square = new square();
    }

public void drawcircle(){
    circle.draw();
}
public void drawrectangle(){
    rectangle.draw();
}
public void drawsquare(){
    square.draw();
}
}
