
interface AreaCalculate {
    double calculateArea();
}

class Shape {
     double dimension1;
     double dimension2;

    public Shape(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double getDimension1() {
        return dimension1;
    }

    public double getDimension2() {
        return dimension2;
    }
}

class Rectangle extends Shape implements AreaCalculate {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double calculateArea() {
        return getDimension1() * getDimension2();
    }
}

class Square extends Shape implements AreaCalculate {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double calculateArea() {
        return Math.pow(getDimension1(), 2);
    }
}

class Circle extends Shape implements AreaCalculate {
    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(getDimension1(), 2);
    }
}

public class area {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(5);
        Circle circle = new Circle(4);

        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}