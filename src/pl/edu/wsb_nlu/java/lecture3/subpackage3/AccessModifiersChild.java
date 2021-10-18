package pl.edu.wsb_nlu.java.lecture3.subpackage3;

import pl.edu.wsb_nlu.java.lecture3.subpackage2.AccessModifiers;

public class AccessModifiersChild extends AccessModifiers {
    public static void main(String[] args) {
        AccessModifiers.testPublic();
        AccessModifiers.testProtected();
//        AccessModifiers.testDefault();
//        AccessModifiers.testPrivate();
    }
}
