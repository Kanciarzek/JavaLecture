package pl.edu.wsb_nlu.java.lecture4.final_keyword;

public class MainFinal {
    public static void main(String[] args) {
//        MyClass.myValue = 10;
        System.out.println(MyClass.myValue);
        MyClass myClass = new MyClass(1);
//        myClass.myValue3 = 2;
        System.out.println(myClass.myValue3);
    }
}
