package pl.edu.wsb_nlu.java.lecture8.annotations.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Book {
    @Getter
    @Setter
    private String title;
    private String author;
    private int pages;
    private int issueYear;
}
