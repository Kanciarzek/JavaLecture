package pl.edu.wsb_nlu.java.lecture4.final_keyword;

public class MyClass {
    static final int myValue = 5;
    final int myValue3;

    MyClass(int value){
        this.myValue3 = value;
    }

    final void printValue3(){
        System.out.println(myValue3);
    }

}
