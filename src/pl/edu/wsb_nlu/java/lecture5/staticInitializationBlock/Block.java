package pl.edu.wsb_nlu.java.lecture5.staticInitializationBlock;

public class Block {
    static int i = 0;
    static {
        i++;
    }
    {
        i++;
    }
    public static void main(String[] args){
        Block block;
        block = new Block();
        block = new Block();
        System.out.println(i);
    }
}
