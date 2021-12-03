package pl.edu.wsb_nlu.java.lecture8.annotations;

import java.util.ArrayList;

public class DeprecationMain {
    public static void main(String[] args){
        Deprecation deprecation = new Deprecation(new ArrayList<>());
        deprecation.addVersion("test");
    }    
}
