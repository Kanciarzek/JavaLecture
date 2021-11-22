
package pl.edu.wsb_nlu.java.lecture7.interfaces;

public class Person implements Hello, HelloPretty {
    
    String name;
    String surname;
    
    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public void greet() {
        System.out.println("Hello");
    }

    public void greetPretty() {
        System.out.println("Welcome! I am " + name + " " + surname + ". Nice to meet you!");
    }

    public void greetPrettyName(String name) {
        System.out.println("Welcome! I am " + this.name + " " + this.surname + ". Nice to meet you, " + name + "!");
    }
    
}
