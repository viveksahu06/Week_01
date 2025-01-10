import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create a variable to store the sum of divisors, initialized to 0
        int sum = 0;

        // Run a for loop to find divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                // If 'i' is a divisor, add it to the sum
                sum += i;
            }
        }

        // Check if the sum of divisors is greater than the number itself
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
    }
}