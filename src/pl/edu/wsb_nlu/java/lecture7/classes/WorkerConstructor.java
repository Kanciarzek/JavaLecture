
package pl.edu.wsb_nlu.java.lecture7.classes;

public class WorkerConstructor extends PersonConstructor {
    protected int salary;
    
    WorkerConstructor(String name, String surname, int salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
    
    protected void greet(){
        System.out.println("Go to work, " + surname + "!");
    }
    
}
