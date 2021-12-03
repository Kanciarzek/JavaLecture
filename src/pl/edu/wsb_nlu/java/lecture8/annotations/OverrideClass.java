/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.edu.wsb_nlu.java.lecture8.annotations;

/**
 *
 * @author pawli
 */
public class OverrideClass {
    void hello() {
        System.out.println("Hello");
    }
    
    public static void main(String[] args){
    }
    
    static class Overridden extends OverrideClass {
//        @Override
        void hello() {
            System.out.println("Welcome");
        }
//        @Override
        void goodbye() {
            System.out.println("Goodbye");
        }
    }
}
