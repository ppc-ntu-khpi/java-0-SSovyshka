public class QuotationTest {
    public static void main(String args[]) {
        Quotation myQuotationDefault = new Quotation();
        myQuotationDefault.display();
        System.out.println(" ");
        Quotation myQuotationTwo = new Quotation("That which does not kill us makes us stronger.", "Friedrich Nietzsche");
        myQuotationTwo.display();
    }
}
