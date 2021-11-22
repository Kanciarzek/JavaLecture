
package pl.edu.wsb_nlu.java.lecture7.classes;

public class PersonConstructor {
    public String name;
    public String surname;
    
    PersonConstructor(){}
    
    PersonConstructor(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    
    protected void greet(){
        System.out.println("Welcome, " + name + " " + surname);
    }
    
}
