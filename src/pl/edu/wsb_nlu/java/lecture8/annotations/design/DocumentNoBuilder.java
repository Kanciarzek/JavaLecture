package pl.edu.wsb_nlu.java.lecture8.annotations.design;

import java.util.List;

class DocumentNoBuilder {

    private String title = "Default title";
    private String category = "Default category";
    private List<String> signatures = List.of("Default signature");

    public DocumentNoBuilder(String title, String category, List<String> signatures) {
        this.title = title;
        this.category = category;
        this.signatures = signatures;
    }
    
    public DocumentNoBuilder(String category, List<String> signatures) {
        this.category = category;
        this.signatures = signatures;
    }

//    It has the same argument types as constructor above
//    public DocumentNoBuilder(String title, List<String> signatures) {
//        this.title = title;
//        this.signatures = signatures;
//    }
    
}
