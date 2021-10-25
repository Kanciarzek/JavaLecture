package pl.edu.wsb_nlu.java.lecture4.interfaces;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("Area of circle is " + circle.getArea() + " and its perimeter is " + circle.getPerimeter());
        System.out.println("Area of rectangle is " + rectangle.getArea() + " and its perimeter is " + rectangle.getPerimeter());
    }
}
