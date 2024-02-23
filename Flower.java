public class Flower {
    // Attributes for the new flowershop 
    private String name;
    private String color;
    private double price;
    private int quantity;

    // Constructors for the coding
    public Flower() {
        // Default constructor
        name = null;
        color = null;
        price = 0.0;
        quantity = 0;
    }

    public Flower(String name, String color, double price, int quantity) {
        //constructor with the use of parameter
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to describe the flower
    public void describe() {
        System.out.println("A " + color + " " + name + " flower costs $" + price + ".");
    }

    // Override method using  toString method
    public String toString() {
        return "Name: " + name + "\nColor: " + color + "\nPrice: $" + price + "\nQuantity: " + quantity;
    }
}
