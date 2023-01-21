public class Shirt {

    public int shirtID = 0; // стандартне значення номера моделі сорочки
    public String description = "-description required-"; // стандартний опис сорочки
    // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
    private char colorCode = 'U';

    private String color = "Невідомо";

    public double price = 0.0; // стандартна вартість сорочки
    public int quantityInStock = 0; // стандартна кількість на складі

    // цей метод просто виводить всю інформацію про сорочку на екран
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Color : " + getColor());
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    } // кінець методу displayShirtInformation


    public Shirt() {
    }

    public Shirt(int shirtID, String description, char colorCode, double price, int quantityInStock) {
        this.shirtID = shirtID;
        this.description = description;
        this.setColorCode(colorCode);
        this.price = price;
        this.quantityInStock = quantityInStock;


    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
        switch (this.colorCode){
            case 'R':
                this.setColor("червоний");
                break;
            case 'B':
                this.setColor("синій");
                break;
            case 'G':
                this.setColor("зелений");
                break;
            default:
                this.setColor("невідомо");
                break;
        }
    }

    public String getColor() {
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }
}
