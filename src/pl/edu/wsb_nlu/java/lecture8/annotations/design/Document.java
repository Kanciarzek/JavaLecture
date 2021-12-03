package pl.edu.wsb_nlu.java.lecture8.annotations.design;

import java.util.List;

class Document {

    private final String title;
    private final String category;
    private final List<String> signatures;

    private Document(String title, String category, List<String> signatures) {
        this.title = title;
        this.category = category;
        this.signatures = signatures;
    }

    static DocumentItemBuilder builder() {
        return new DocumentItemBuilder();
    }

    public String toString() {
        return "DocumentItem(title=" + this.title + ", \ncategory=" + this.category
                + ", \nsignatures=" + this.signatures + ")";
    }

    static class DocumentItemBuilder {

        private String title;
        private String category;
        private List<String> signatures;

        DocumentItemBuilder title(String title) {
            this.title = title;
            return this;
        }

        DocumentItemBuilder category(String category) {
            this.category = category;
            return this;
        }

        DocumentItemBuilder signatures(List<String> signatures) {
            this.signatures = signatures;
            return this;
        }

        Document build() {
            return new Document(title, category, signatures);
        }
    }
}
