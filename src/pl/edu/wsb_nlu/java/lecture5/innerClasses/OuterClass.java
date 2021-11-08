package pl.edu.wsb_nlu.java.lecture5.innerClasses;

public class OuterClass {
    int counter = 0;
    public class InnerClass {
        {
            counter++;
        }
    }
}
