/*Create a program to count the number of digits in an integer.
Hint => 
Get an integer input for the number variable.
Create an integer variable count with value 0.
Use a loop to iterate until number is not equal to 0.
Remove the last digit from number in each iteration
Increase count by 1 in each iteration.
Finally display the count to show the number of digits
 */
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Store the original number for later use if needed
        int originalNumber = number;

        // Initialize a variable count to 0
        int count = 0;

        // Check if the number is 0 (0 has 1 digit)
        if (number == 0) {
            count = 1;
        } else {
            // Loop until the number is reduced to 0
            while (number != 0) {
                // Remove the last digit by dividing by 10
                number /= 10;

                // Increase the digit count
                count++;
            }
        }

        // Display the result
        System.out.println("The number " + originalNumber + " has " + count + " digits.");
    }
}
