package pl.edu.wsb_nlu.java.lecture4.interfaces;

public class Circle2 implements Shape, Drawable {
    private double r;

    public Circle2(double r){
        this.r = r;
    }
    public double getArea(){
        return Math.PI * r * r;
    }
    public double getPerimeter(){
        return 2 * Math.PI * r;
    }
    public void draw() {
        for (int i = -(int)r+1; i < r; i++){
            for (int j = -(int)r+1; j < r; j++) {
                if ( i * i + j * j < (r * r - 16))
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }

}
