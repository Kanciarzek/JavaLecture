package pl.edu.wsb_nlu.java.lecture4.interfaces;

public class Rectangle2 implements Shape, Drawable {
    private double a;
    private double b;

    public Rectangle2(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        return a * b;
    }
    public double getPerimeter(){
        return 2 * (a + b);
    }

    public void draw() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
