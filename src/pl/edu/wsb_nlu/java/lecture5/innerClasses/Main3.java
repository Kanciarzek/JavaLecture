package pl.edu.wsb_nlu.java.lecture5.innerClasses;

public class Main3 {
    public static void main(String[] args) {
        LineSegment lineSegment = new LineSegment(2,0,5,0);
        LineSegment.Point point = new LineSegment.Point(5,2);
        System.out.println(lineSegment.getLength());
        System.out.println(point.distanceToPoint(lineSegment.B));
    }
}
