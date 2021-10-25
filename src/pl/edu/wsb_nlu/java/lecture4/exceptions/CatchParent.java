package pl.edu.wsb_nlu.java.lecture4.exceptions;

public class CatchParent {
    public static void main(String[] args) {
        String a = null;
        try {
            System.out.println(a.toLowerCase());
            System.out.println("String1");
        } catch (RuntimeException e) {
//        } catch (RuntimeException | NullPointerException e) {
// Line above will not compile because RuntimeException is parentClass of NullPointerException
            System.out.println("String2");
        }
        System.out.println("String4");
    }
}
