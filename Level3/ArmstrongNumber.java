import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Store the original number for comparison later
        int originalNumber = number;
        
        // Define a variable to hold the sum of cubes of digits
        int sum = 0;
        
        // Loop to extract each digit and calculate the cube of each
        while (number != 0) {
            // Get the last digit of the number using modulus operator
            int digit = number % 10;
            
            // Calculate the cube of the digit and add it to the sum
            sum += digit * digit * digit;
            
            // Remove the last digit from the number
            number /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

    }
}
