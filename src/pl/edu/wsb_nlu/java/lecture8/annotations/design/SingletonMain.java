package pl.edu.wsb_nlu.java.lecture8.annotations.design;

public class SingletonMain {
    public static void main(String[] args){
        Singleton s1 = Singleton.getObjectOrCreate();
        Singleton s2 = Singleton.getObjectOrCreate();
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
