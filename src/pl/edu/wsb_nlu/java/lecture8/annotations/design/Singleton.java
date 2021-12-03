package pl.edu.wsb_nlu.java.lecture8.annotations.design;

public class Singleton {
    
    private static Singleton instance = null;
    
    private Singleton() {}
    
    public static Singleton getObjectOrCreate(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
    
}
