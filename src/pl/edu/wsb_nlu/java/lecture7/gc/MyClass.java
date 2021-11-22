
package pl.edu.wsb_nlu.java.lecture7.gc;

public class MyClass {
    @Override
    public void finalize(){
        System.out.println("Hello from finalizer");
    }
}
