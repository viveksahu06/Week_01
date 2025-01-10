/*
Create a program to check if a number taken from the user is a Harshad Number.
Hint => 
A Harshad number is an integer which is divisible by the sum of its digits. 
For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
Get an integer input for the number variable.
Create an integer variable sum with initial value 0.
Create a while loop to access each digit of the number.
Inside the loop, add each digit of the number to sum.
Check if the number is perfectly divisible by the sum.
If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.
 */
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create a variable to store the sum of digits, initialized to 0
        int sum = 0;
        int originalNumber = number;  // Store the original number for later use

        // Calculate the sum of the digits of the number
        while (number != 0) {
            // Extract the last digit of the number using modulus operator
            int digit = number % 10;
            
            // Add the digit to the sum
            sum += digit;

            // Remove the last digit of the number by dividing it by 10
            number /= 10;
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is Not a Harshad Number.");
        }

    }
}
