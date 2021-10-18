package pl.edu.wsb_nlu.java.lecture3.initialization;

public class MyClassConstructor {
    int i;
    private double j;
    String s;

    MyClassConstructor(int i, String s1) {
        this.i = i;
        this.s = s1;
    }

    public double getJ() {
        return j;
    }
}
