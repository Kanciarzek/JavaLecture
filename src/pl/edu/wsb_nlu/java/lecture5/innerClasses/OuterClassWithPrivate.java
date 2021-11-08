package pl.edu.wsb_nlu.java.lecture5.innerClasses;

public class OuterClassWithPrivate {
    private class InnerClass{

    }
    private class Innerclass2{

    }
    private interface InnerInterface{

    }
    OuterClassWithPrivate(){
        InnerClass innerClass = new InnerClass();
        Innerclass2 innerclass2 = new Innerclass2();
    }
}
