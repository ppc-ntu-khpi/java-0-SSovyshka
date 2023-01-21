public class Quotation {
    private String quote = "Some quote";
    private String author = "Some author";
    public void display() {
        System.out.println(quote);
        System.out.println(author);
    }
    public Quotation() {

    }
    public Quotation(String quote, String author) {
        this.quote = quote;
        this.author = author;
    }

}