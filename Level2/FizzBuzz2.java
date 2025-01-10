/*Rewrite the program 5 FizzBuzz using while loop 
 */
import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner  sc = new Scanner(System.in);

        // Take the number input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize a counter variable
            int i = 1;

            // While loop to iterate from 1 to the number
            while (i <= number) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                // Otherwise, print the number itself
                else {
                    System.out.println(i);
                }

                // Increment the counter
                i++;
            }
        }
    }
}
