package pl.edu.wsb_nlu.java.lecture3;

//Line below is not needed
//import pl.edu.wsb_nlu.java.lecture3.Hello;
import pl.edu.wsb_nlu.java.lecture3.subpackage1.HelloSubpackage1;

public class UseHello {
    public static void main(String[] args) {
        Hello.main(args);
        HelloSubpackage1.main(args);
    }
}
