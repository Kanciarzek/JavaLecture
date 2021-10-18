package pl.edu.wsb_nlu.java.lecture3.object;

import pl.edu.wsb_nlu.java.lecture3.abstractShapes.Circle;
import pl.edu.wsb_nlu.java.lecture3.abstractShapes.Shape;

public class IsInstance {
    public static void main(String[] args) {
        Circle circle = new Circle(5);

        System.out.println(Circle.class.isInstance(circle));
        System.out.println(Shape.class.isInstance(circle));
        System.out.println(String.class.isInstance(circle));
        System.out.println(Object.class.isInstance(circle));
    }
}
