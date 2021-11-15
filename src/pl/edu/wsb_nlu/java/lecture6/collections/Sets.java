package pl.edu.wsb_nlu.java.lecture6.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Elisabeth");
        set.add("John");
        set.add("Jerry");
        for (String s: set){
            System.out.println(s);
        }
    }
}
