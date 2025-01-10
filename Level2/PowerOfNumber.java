/*
 Create a program to find the power of a number.
Hint => 
Get integer input for two variables named number and power.
Create a result variable with an initial value of 1.
Run a for loop from i = 1 to i <= power.
In each iteration of the loop, multiply the result with the number and assign the value to the result.
Finally, print the result

 */
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take the number and power inputs from the user
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initialize result as 1 (since any number raised to the power of 0 is 1)
        int result = 1;

        // Loop from 1 to power
        for (int i = 1; i <= power; i++) {
            // Multiply result by number in each iteration
            result *= number;
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);
    }
}
