/*
Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 
*/
import java.util.Scanner;

public class SumNNaturalNum {
    public int findSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.println("Enter number:");
        int number = input.nextInt();

        // creating find object of SumNNaturalNum class
        SumNNaturalNum find = new SumNNaturalNum();

        // Displaying result
        // Checking if the number is a positive integer (natural number)
        if (number > 0) {
            System.out.println("The sum of " + number + " natural numbers is " + find.findSum(number));
        } else {
            // If the number is not a natural number
            System.out.println("The number " + number + " is not a natural number");
        }
    }
}
