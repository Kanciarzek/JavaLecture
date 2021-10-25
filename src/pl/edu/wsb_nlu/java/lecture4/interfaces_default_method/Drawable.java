package pl.edu.wsb_nlu.java.lecture4.interfaces_default_method;

public interface Drawable {
    default void draw(){
        System.out.println("------------");
    }
}
