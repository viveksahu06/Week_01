/*Write a Program to check if the given number is a prime number or not
Hint => 
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
Use isPrime boolean variable to store the result
 */
import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take the number input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Assume the number is prime
        boolean isPrime = true;

        // Check if the number is greater than 1 (since prime numbers are greater than 1)
        if (number <= 1) {
            isPrime = false;  // Numbers less than or equal to 1 are not prime
        } else {
            // Loop through numbers from 2 to sqrt(number) to check for divisibility
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;  // If divisible, it's not a prime number
                    break;  // Exit the loop early since we know it's not a prime
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}
