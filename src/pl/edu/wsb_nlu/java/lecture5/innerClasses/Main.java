package pl.edu.wsb_nlu.java.lecture5.innerClasses;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass outerClass2 = new OuterClass();
        OuterClass.InnerClass innerClass;
        innerClass = outerClass.new InnerClass();
        innerClass = outerClass.new InnerClass();
        innerClass = outerClass2.new InnerClass();
        System.out.println(outerClass.counter);
        System.out.println(outerClass2.counter);
    }
}
