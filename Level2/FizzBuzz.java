/*Write a program FizzBuzz, take a number as user input, and if it is a positive integer loop from 0 to the number and print the number, but for multiples of 3 print "Fizz" instead of the number, for multiples of 5 print "Buzz", and for multiples of both print "FizzBuzz".
Hint => 
Write the program and use for loop
*/
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner  sc = new Scanner(System.in);

        // Take the number input from the user
        System.out.print("Enter a positive integer: ");
        int number =  sc.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 1 to the number
            for (int i = 1; i <= number; i++) {
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
            }
        }
    }
}
