import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking first number as input
        System.out.print("Enter the first number (number1): ");
        int number1 = sc.nextInt();

        // Taking second number as input
        System.out.print("Enter the second number (number2): ");
        int number2 = sc.nextInt();

        // Printing numbers before swapping
        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

        // Swapping the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Printing numbers after swapping
        System.out.println("The swapped numbers are " + number1 + " and " + number2 + ".");

    }
}
