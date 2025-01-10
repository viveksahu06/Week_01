import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object 'sc'
        
        // Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check if the number is a positive integer (natural number)
        if (number > 0) {
            // Calculate the sum of the first 'n' natural numbers
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        }
        else {
            // If the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
        
    }
}
