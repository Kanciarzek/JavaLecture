
package pl.edu.wsb_nlu.java.lecture7.classes;

public class WorkerConstructor3 extends PersonConstructor {
    protected int salary;
    
    WorkerConstructor3(String name, String surname){
        super(name, surname);
    }
    
    WorkerConstructor3(String name, String surname, int salary){
        this(name, surname);
        this.salary = salary;
    }
    
    protected void greet(){
        System.out.println("Go to work, " + surname + "!");
    }
    
}
