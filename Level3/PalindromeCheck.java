/*
Write a program to to check if a text is palindrome and display the result
Hint => 
Palindrome is a word, phrase, number, or other sequence of characters that 
reads the same forward and backward
Logic 1: Write a method to compare the characters from the start and end of 
the string to determine the text is palindrome. The logic used here is as follows:
Set the start and end indexes of the text
Loop through the text and compare the characters from the start and the end of the
 string. If the characters are not equal, return false
Logic 2: Write a recursive method to compare the characters from the start and end
 of the text passed as parameters using recursion. The logic used here is as 
 follows:
First, check if the start index is greater than or equal to the end index, then 
return true.
If the characters at the start and end indexes are not equal, return false.
Otherwise, call the method recursively with the start index incremented by 1 and 
the end index
Logic 3: Write a Method to compare the characters from the start and end of the 
text using  character arrays. The logic used here is as follows:
Firstly Write a Method to reverse a string using charAt() method and return the 
reversal array.
Create a character array using String method toCharArray() and also create a 
reverse array. Compare the characters in the original and reverse arrays to do 
Palindrome check 
Finally in the main method do palindrom check using the three logic and display 
result
*/
import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative method to check if a string is a palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check if a string is a palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays
    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseStringUsingCharAt(text);

        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string using charAt()
    public static char[] reverseStringUsingCharAt(String text) {
        int n = text.length();
        char[] reversed = new char[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = text.charAt(n - 1 - i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert input to lowercase to handle case insensitivity
        input = input.toLowerCase();

        // Check palindrome using all three logics
        boolean iterativeResult = isPalindromeIterative(input);
        boolean recursiveResult = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean charArrayResult = isPalindromeUsingCharArray(input);

        // Display results
        System.out.println("Palindrome Check Results:");
        System.out.println("Using Iterative Logic: " + (iterativeResult ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursive Logic: " + (recursiveResult ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Char Array Logic: " + (charArrayResult ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }
}
