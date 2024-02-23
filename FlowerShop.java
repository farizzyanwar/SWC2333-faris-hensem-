import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Flower[] inventory = new Flower[10]; // Create an array of Flower objects with a size of 10

        // ask the user to enter the data for each corresponding object in the array
        for (int i = 0; i < inventory.length; i++) {
            System.out.println("Enter details for Flower " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            inventory[i] = new Flower(name, color, price, quantity);
        }

        // Display all the flower details
        System.out.println("\nAll Flower Details:");
        for (Flower flower : inventory) {
            System.out.println(flower.toString());
        }
        //method for Calculate and display the total value of the flower inventory
        double totalValue = 0;
        for (Flower flower : inventory) {
            totalValue += flower.getPrice() * flower.getQuantity();
        }
        System.out.println("\nTotal Value of Flower Inventory: $" + totalValue);

        // Allow the user to search for a flower by name and display its details
        System.out.print("\nEnter the name of the flower to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Flower found:");
                System.out.println(flower.toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Flower with name \"" + searchName + "\" not found.");
        }

        // Implement a method to restock a specific flower in the inventory
        System.out.print("\nEnter the name of the flower to restock: ");
        String restockName = scanner.nextLine();
        System.out.print("Enter the quantity to restock: ");
        int restockQuantity = scanner.nextInt();
        for (Flower flower : inventory) {
            if (flower.getName().equalsIgnoreCase(restockName)) {
                flower.setQuantity(flower.getQuantity() + restockQuantity);
                System.out.println("Restocked " + restockQuantity + " " + restockName + "(s).");
                break;
            }
        }

        scanner.close();
    }
}
