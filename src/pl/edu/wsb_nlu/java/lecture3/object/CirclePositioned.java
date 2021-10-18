package pl.edu.wsb_nlu.java.lecture3.object;

import pl.edu.wsb_nlu.java.lecture3.abstractShapes.Circle;

public class CirclePositioned extends Circle {

    private double x;
    private double y;

    public CirclePositioned(double r, double x, double y) {
        super(r); //we call here a constructor of parent class
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Circle of area: " + getArea() + " and perimeter: " + getPerimeter() + " at point (" + x + "," + y + ")";
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CirclePositioned that = (CirclePositioned) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0 && Double.compare(that.getR(), getR()) == 0;
    }

    public int hashCode() {
        return Math.round((float) (x * y * getR()));
    }
}
