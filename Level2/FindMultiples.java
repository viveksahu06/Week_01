/*
Create a program to find all the multiple of a number taken as user input below 100.
Hint => 
Get input value for a variable named number.
Run a for loop backward: from i = 100 to i = 1.
Inside the loop, check if i perfectly divide the number.
If true, print the number and continue the loop.
 */
import java.util.Scanner;

public class FindMultiples {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the input number from the user
        System.out.print("Enter a number: ");
        int number =  sc.nextInt();

        // Print the multiples of the number below 100
        System.out.println("The multiples of " + number + " below 100 are:");

        // Loop from 100 down to 1
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the number
            if (i % number == 0) {
                System.out.println(i);  // Print the multiple
            }
        }
    }
}
