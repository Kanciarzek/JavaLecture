package pl.edu.wsb_nlu.java.lecture7.interfaces;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<HelloPretty> list = new LinkedList<>();
        HelloPretty dog = new HelloPretty() {
            @Override
            public void greetPretty() {
                System.out.println("Woof, woof!");
            }

            @Override
            public void greetPrettyName(String name) {
                greetPretty();
            }
        };
        Person john = new Person("John", "Doe");
        Person george = new Person("George", "Doe") {
            @Override
            public void greetPrettyName(String name) {
                greetPretty();
            }
        };
        list.add(john);
        list.add(dog);
        list.add(george);
        for (HelloPretty h: list){
            h.greetPrettyName("Elisabeth");
        }
    }
}
