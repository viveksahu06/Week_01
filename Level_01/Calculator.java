/*Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations
Hint => 
Create a variable number1 and number 2 and take user inputs.
Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable and finally print the result
I/P => number1, number2
O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___
*/ 
import java.util.*;
public class Calculator { 
    public static void main(String[] args) {
        // Create scanner to take input
        Scanner sc = new Scanner(System.in);     
        // Taking input for the first number
        int number1 = sc.nextInt(); 
        
        // Takinginput for the second number
        int number2 = sc.nextInt();  

        // Perform addition, subtraction, multiplication, and division
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %d and %d is %d, %d, %d, and %.2f", 
                           number1, number2, 
                          (number1 + number2), 
                          (number1 - number2), 
                          (number1 * number2), 
                          (number1 / (float) number2));
    }
}
