package pl.edu.wsb_nlu.java.lecture6.wrapper;

public class Wrappers {

    public static void main(String[] args) {
        Integer i = new Integer(5);
        Double d = new Double(5.0);
//        System.out.println(d == i);
        System.out.println(i + d);
        System.out.println(i == 5);
        System.out.println(d == 5);
        Double d2 = 0.1 + 0.2;
        System.out.println(d2 == 0.3);
    }

}
