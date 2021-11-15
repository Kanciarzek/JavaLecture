package pl.edu.wsb_nlu.java.lecture6.wrapper;

public class Wrappers3 {

    public static void main(String[] args) {
        Integer i = 5;
        Double d = 5.0;
        System.out.println(Number.class.isInstance(i));
        System.out.println(Number.class.isInstance(d));
    }
}