package pl.edu.wsb_nlu.java.lecture4.exceptions;

public class Throwing2 {

    public static void throwException() throws Exception {
        throw new Exception("This is message");
    }

    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
