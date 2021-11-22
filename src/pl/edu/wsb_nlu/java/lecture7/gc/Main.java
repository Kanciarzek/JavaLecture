package pl.edu.wsb_nlu.java.lecture7.gc;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyClass m = new MyClass();
        MyClass m2 = new MyClass();
        MyClass m3 = m;
        m2 = m;
        m = null;
        MyClass m4 = m;
        m2 = null;
        m3 = null;
        m4 = null;
        System.gc();
        TimeUnit.SECONDS.sleep(5);
    }
}
