package pl.edu.wsb_nlu.java.lecture5.staticInitializationBlock;

public class MyClass {
    int value;
    static int a = 0;
    static {
        System.out.println("Hello from static initialization block");
    }
    {
        System.out.println("Hello from initialization block");
        value = 5;
    }
    MyClass(){
        System.out.println("Hello from Constructor");
    }

}
