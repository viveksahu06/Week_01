import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        char operation = getOperation("Choose an operation (+, -, *, /): ");
        double result = performOperation(num1, num2, operation);

        System.out.println("Result: " + result);
    }

    // Function to get user input
    private static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to get operation choice
    private static char getOperation(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.next().charAt(0);
    }

    // Function to perform the chosen operation
    private static double performOperation(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return (b != 0) ? (double) a / b : Double.NaN;
            default: throw new IllegalArgumentException("Invalid operation.");
        }
    }
}
