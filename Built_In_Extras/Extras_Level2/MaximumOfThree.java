import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");

        // Calculate the maximum of three numbers
        int max = findMaximum(num1, num2, num3);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + max);
    }

    // Function to take input from the user
    private static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to find the maximum of three numbers
    private static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c)); // Use Math.max for comparison
    }
}
