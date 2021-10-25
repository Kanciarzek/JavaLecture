package pl.edu.wsb_nlu.java.lecture4.exceptions;

public class Experiment3 {
    public static void main(String[] args) {
        String a = null;
        try {
            System.out.println(a.toLowerCase());
            System.out.println("String1");
        } catch (ArithmeticException e) { // It is not NullPointerException!
            System.out.println("String2");
        } finally {
            System.out.println("String3");
        }
        System.out.println("String4");
    }
}
