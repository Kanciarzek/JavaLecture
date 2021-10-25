package pl.edu.wsb_nlu.java.lecture4.exceptions;

public class MultipleCatch {
    public static void main(String[] args) {
        String a = null;
        try {
            System.out.println(a.toLowerCase());
            System.out.println("String1");
        } catch (ArithmeticException e) {
            System.out.println("String2");
        } catch (NullPointerException e) {
            System.out.println("String2a");
        } finally {
            System.out.println("String3");
        }
        System.out.println("String4");
    }
}
