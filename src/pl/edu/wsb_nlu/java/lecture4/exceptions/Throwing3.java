package pl.edu.wsb_nlu.java.lecture4.exceptions;

public class Throwing3 {

    public static void throwException() throws Exception {
        throw new Exception("This is message");
    }

    public static void main(String[] args) throws Exception {
        throwException();
    }
}
