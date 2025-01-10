/*
 Create a program to print the greatest factor of a number beside itself using a loop.
Hint => 
Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
Display the greatestFactor variable outside the loop

 */
import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take the number input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize the greatestFactor to 1
        int greatestFactor = 1;

        // Loop from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                // Assign i to greatestFactor and break the loop
                greatestFactor = i;
                break;
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);

       
    }
}
