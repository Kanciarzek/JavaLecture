
package pl.edu.wsb_nlu.java.lecture7.classes;

public class WorkerConstructor2 extends PersonConstructor {
    protected int salary;
    
    WorkerConstructor2(String name, String surname, int salary){
        super(name, surname);
        this.salary = salary;
    }
    
    protected void greet(){
        if (salary >= 1000)
            super.greet();
        else
            System.out.println("Go to work, " + surname + "!");
    }
    
}
