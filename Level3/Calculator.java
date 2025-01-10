/*Write a program to create a calculator using switch...case.
Hint => 
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc= new Scanner(System.in);

        // Declare the variables
        double first, second, result;
        String op;

        // Get the user input for the two numbers and the operator
        System.out.print("Enter the first number: ");
        first = sc.nextDouble();

        System.out.print("Enter the second number: ");
        second = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        op = sc.next();

        // Use switch...case to perform the correct operation based on the operator
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + first + " + " + second + " = " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + first + " - " + second + " = " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + first + " * " + second + " = " + result);
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + first + " / " + second + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                // If the operator is not recognized, print an error message
                System.out.println("Invalid operator! Please use one of the following: +, -, *, /");
                break;
        }

    }
}
