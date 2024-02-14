package Structural_Patterns.FacadeShape;

public class facade_demo {
    public static void main(String[] args) {
        shape_maker shapeMaker = new shape_maker();
        shapeMaker.drawcircle();
        shapeMaker.drawrectangle();
        shapeMaker.drawsquare();

    }
}
