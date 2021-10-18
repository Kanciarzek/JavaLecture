package pl.edu.wsb_nlu.java.lecture3.initialization;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyClassConstructor myClassConstructor = new MyClassConstructor(5, "test");
//        MyClassConstructor myClassConstructor2 = new MyClassConstructor();
        System.out.println(myClass.i);
        System.out.println(myClass.getJ());
        System.out.println(myClass.s);

        System.out.println(myClassConstructor.i);
        System.out.println(myClassConstructor.getJ());
        System.out.println(myClassConstructor.s);
    }
}
