
package pl.edu.wsb_nlu.java.lecture7.classes;

public class Worker extends Person {
    protected int salary;
    
    protected void greet(){
        System.out.println("Go to work, " + surname + "!");
    }
    
}
