package pl.edu.wsb_nlu.java.lecture8.annotations.design;

import java.util.List;


class DocumentMain {
    public static void main(String[] args){
        Document document = Document.builder().title("Unknown").category("anonymous").signatures(List.of("John Doe")).build();
        Document document2 = Document.builder().title("Harry Potter and Philosopher's Stone").build();
        
    }
}
