import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        int number = getInput("Enter a number to calculate its factorial: ");
        int result = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }

    // Function to get user input
    private static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Recursive function to calculate factorial
    private static int calculateFactorial(int num) {
        return (num <= 1) ? 1 : num * calculateFactorial(num - 1);
    }
}
