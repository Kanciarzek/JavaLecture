package pl.edu.wsb_nlu.java.lecture8.annotations.lombok;

public class BookNoLombok {
    private String title;
    private String author;
    private int pages;
    private int issueYear;
    
    BookNoLombok(String title, String author, int pages, int issueYear){
        this.title=title;
        this.author=author;
        this.pages=pages;
        this.issueYear=issueYear;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
}
