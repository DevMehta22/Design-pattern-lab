package defaultArea;

import area.shapeFactory;
import area.Area;

public class shapeMain {
    public static void main(String[] args) {
        shapeFactory shf = new shapeFactory();
        Area ar = shf.getInstance("triangle");
        ar.shape();
    }
}
