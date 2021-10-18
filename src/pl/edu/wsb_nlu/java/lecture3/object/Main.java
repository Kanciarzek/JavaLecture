package pl.edu.wsb_nlu.java.lecture3.object;

public class Main {
    public static void main(String[] args) {
        CirclePositioned myCircle = new CirclePositioned(5, 2, 2);
        CirclePositioned myCircle2 = new CirclePositioned(6, 2, 2);
        CirclePositioned myCircle3 = new CirclePositioned(5, 10, 2);
        System.out.println(myCircle);
        System.out.println(myCircle.equals(myCircle2));
        System.out.println(myCircle.equals(myCircle3));
    }
}
