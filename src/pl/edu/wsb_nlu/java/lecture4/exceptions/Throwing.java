package pl.edu.wsb_nlu.java.lecture4.exceptions;

public class Throwing {

    public static void throwException(){
        try {
            throw new Exception("This is message");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        throwException();
    }
}
