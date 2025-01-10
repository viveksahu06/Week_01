/*
 Create a program to find the factors of a number taken as user input.
Hint => 
Get the input value for a variable named number.
Run a for loop from i = 1 to i < number.
In each iteration of the loop, check if number is perfectly divisible by i.
If true, print the value of i.
 */
import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Print the factors of the number
        System.out.println("The factors of " + number + " are:");

        // Loop through numbers from 1 to number-1
        for (int i = 1; i <= number; i++) {
            // Check if i is a factor of number
            if (number % i == 0) {
                System.out.println(i);  // Print the factor
            }
        }
    }
}
