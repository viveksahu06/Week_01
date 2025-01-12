/*
Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers 
check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint => 
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2 
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly 
If the number is negative, print negative. 
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less*/

import java.util.Scanner;

public class CheckNumberSign {

    // Method to check whether a number is positive or negative
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Method to check whether a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 > number2
        } else if (number1 == number2) {
            return 0; // number1 == number2
        } else {
            return -1; // number1 < number2
        }
    }

    public static void main(String[] args) {
        // Defining Scanner class
        Scanner sc = new Scanner(System.in);

        // Defining array of size 5
        int number[] = new int[5];

        // Taking number input from user
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        // Checking sign and applying manipulation
        for (int i = 0; i < number.length; i++) {
            if (isPositive(number[i])) {
                System.out.print("Given number " + number[i] + " is a positive number ");
                // Here number is positive, check for even or odd numbers
                if (isEven(number[i])) {
                    System.out.println("and this number is an even number");
                } else {
                    System.out.println("and this number is an odd number");
                }
            } else if (number[i] < 0) {
                System.out.println("Given number " + number[i] + " is a negative number");
            } else {
                System.out.println("Given number " + number[i] + " is " + 0);
            }
        }

        int firstNo = number[0];
        int lastNo = number[number.length - 1];

        // Comparing first and last value of number
        int comparisonResult = compare(firstNo, lastNo);

        if (comparisonResult == 0) {
            System.out.println("Both first and last values are equal");
        } else if (comparisonResult == 1) {
            System.out.println("First number " + firstNo + " is greater than the last number " + lastNo);
        } else {
            System.out.println("First number " + firstNo + " is lesser than the last number " + lastNo);
        }

        // Closing the scanner
        sc.close();
    }
}
