package pl.edu.wsb_nlu.java.lecture4.exceptions;

public class Experiment2 {
    public static void main(String[] args) {
        String a = null;
        try {
            System.out.println(a.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println("String is null!");
        }
    }
}
