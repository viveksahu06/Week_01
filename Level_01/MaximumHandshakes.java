import java.util.Scanner;
public class PurchaseCalculater {
    public static void main(String[] args) {
        // Create scanner to take input
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for unit price
        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = scanner.nextDouble();
        
        // Taking input for quantity
        System.out.print("Enter the quantity to be bought: ");
        int quantity = scanner.nextInt();
        
        // Calculate total price
        double totalPrice = unitPrice * quantity;
        
        // Display the data
        System.out.println("The total purchase price is INR " +(float) totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
