package pl.edu.wsb_nlu.java.lecture5.innerClasses;

public class Main2 {
    public static void main(String[] args) {
        OuterClassWithPrivate outerClassWithPrivate = new OuterClassWithPrivate();
//        OuterClassWithPrivate.InnerClass = new outerClassWithPrivate.new InnerClass();
//        Line above will not compile
    }
}
