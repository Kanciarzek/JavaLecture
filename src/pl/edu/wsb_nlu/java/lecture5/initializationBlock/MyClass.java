package pl.edu.wsb_nlu.java.lecture5.initializationBlock;

public class MyClass {
    int value;
    {
        System.out.println("Hello from initialization block");
        value = 5;
    }

    MyClass(){
        System.out.println("Hello from Constructor");
    }

    MyClass(int value){
        this.value = value;
        System.out.println("Hello from Constructor with value");
    }
}
