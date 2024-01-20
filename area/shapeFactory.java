package area;

public class shapeFactory {
    public Area getInstance(String str){
        if (str.equalsIgnoreCase("rectangle")){
            return new Rectangle();
            }
        else if (str.equalsIgnoreCase("circle")){
            return new Circle();
            } 
        else if(str.equalsIgnoreCase("square")) {
            return new Square();
            }
        else if(str.equalsIgnoreCase("triangle")) {
                return new Triangle();
            }
        else{
            System.out.println("Invalid Shape");
            return null;
        }
        
    }
}
