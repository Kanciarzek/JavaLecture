package pl.edu.wsb_nlu.java.lecture3.subpackage2;

public class AccessModifiers {

    public static void testPublic(){
        System.out.println("Public method test");
    }

    protected static void testProtected(){
        System.out.println("Protected method test");
    }

    static void testDefault(){
        System.out.println("'Default' method test");
    }

    private static void testPrivate(){
        System.out.println("Private method test");
    }
}
