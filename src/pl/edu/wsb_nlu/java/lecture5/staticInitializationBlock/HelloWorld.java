package pl.edu.wsb_nlu.java.lecture5.staticInitializationBlock;

public class HelloWorld {
    static {
        System.out.println("Hello world");
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("Secret message");
    }
}
