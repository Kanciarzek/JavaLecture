package pl.edu.wsb_nlu.java.lecture8.annotations.lombok;

public class Main {
    public static void main(String args[]){
        Book book = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1999, 563);
        System.out.println(book.getTitle());
        System.out.println(book);
    }
}
