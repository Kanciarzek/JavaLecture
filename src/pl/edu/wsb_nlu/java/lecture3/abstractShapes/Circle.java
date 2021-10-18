package pl.edu.wsb_nlu.java.lecture3.abstractShapes;


public class Circle extends Shape {
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    private double r;

    public Circle(double r){
        this.r = r;
    }
    public double getArea(){
        return Math.PI * r * r;
    }
    public double getPerimeter(){
        return 2 * Math.PI * r;
    }

}
