/*Write a program to find the first non-repeating character in a string and show 
the result
Hint => 
Non-repeating character is a character that occurs only once in the string
Create a Method to find the first non-repeating character in a string using charAt()
 method and return the character. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of 
characters are used as indexes in the array to store the frequency of each character
. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Loop through the text to find the first non-repeating character in the text by 
checking the frequency of each character
In the main function take user inputs, call user-defined methods, and displays 
result. 
*/ 
import java.util.Scanner;

public class FirstNonRepeating {

    // Method to find the first non-repeating character in a string
    public static char firstNonRepeatingChar(String str) {
        int[] frequency = new int[256]; // Array to store frequency for all ASCII characters (256 characters)

        //Calculate the frequency of each character in the string
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        //Find the first character with frequency 1
        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        // If no non-repeating character is found, return a space
        return ' ';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method and display the result
        char result = firstNonRepeatingChar(input);
        if (result != ' ') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

    }
}
