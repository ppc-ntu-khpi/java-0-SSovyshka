public class ShirtTest {

    public static void main(String args[]) {
        Shirt myShirtDefault = new Shirt();
        myShirtDefault.displayShirtInformation();
        System.out.println(" ");
        Shirt myShirt = new Shirt(1, "Файна фуфайка", 'G', 100, 10);
        myShirt.displayShirtInformation();
    }
}
