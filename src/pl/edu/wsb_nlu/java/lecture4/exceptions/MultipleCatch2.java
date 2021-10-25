package pl.edu.wsb_nlu.java.lecture4.exceptions;

public class MultipleCatch2 {
    public static void main(String[] args) {
        String a = null;
        try {
            System.out.println(a.toLowerCase());
            System.out.println("String1");
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("String2");
        }
        System.out.println("String4");
    }
}
