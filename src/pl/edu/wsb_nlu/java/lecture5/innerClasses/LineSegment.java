package pl.edu.wsb_nlu.java.lecture5.innerClasses;

public class LineSegment {
    static class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
        double distanceToPoint(Point other){
            return Math.sqrt(Math.pow(other.x-this.x,2)+Math.pow(other.y-this.y,2));
        }
    }
    Point A,B;
    LineSegment(int x1, int y1, int x2, int y2){
        A = new Point(x1,y1);
        B = new Point(x2,y2);
    }
    public double getLength(){
        return A.distanceToPoint(B);
    }
}
