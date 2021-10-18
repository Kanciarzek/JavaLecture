package pl.edu.wsb_nlu.java.lecture3.shapes;

public class Main {

    private static void prettyPrint(Shape shape){
        System.out.println("Perimeter of this shape is: " + Math.round(shape.getPerimeter()*10)/10.0);
        System.out.println("Area of this shape is: " + Math.round(shape.getArea()*10)/10.0);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2,4);
        prettyPrint(circle);
        prettyPrint(rectangle);
    }
}
