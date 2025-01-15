/*Write a program to find the frequency of characters in a string using nested loops and display the result
Hint => 
Create a method to find the frequency of characters in a string and return the 
characters and their frequencies in a 1D array. The logic used here is as follows:
Create an array to store the frequency of each character in the text and an array
 to store the characters in the text using the toCharArray() method
Loops to Find the frequency of each character in the text and store the result in
 an frequency array. For this use Nested Loop with Outer loop to iterate through 
 each character in the text and initialize the frequency of each character to 1. 
 And an Inner loop to check for duplicate characters. In case of duplicate 
 increment the frequency value and set the duplicate characters to '0' to avoid
 counting them again.
Create an 1D String array to store the characters and their frequencies. For this 
Iterate through the characters in the text and store the characters and their 
frequencies 
Finally, the main function takes user inputs, calls the user-defined methods, and 
displays the result. 
*/
import java.util.Scanner;

public class FrequencyWithNestedLoops {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray(); // Convert the string to a character array
        int[] frequencies = new int[chars.length]; // Array to store frequencies

        // Initialize all frequencies to 1
        for (int i = 0; i < chars.length; i++) {
            frequencies[i] = 1;
        }

        // Outer loop iterates through each character
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') { // Skip already processed characters
                continue;
            }
            // Inner loop checks for duplicate characters
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    frequencies[i]++; // Increment the frequency
                    chars[j] = '0';   // Mark the duplicate character as processed
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;
        for (char c : chars) {
            if (c != '0') {
                uniqueCount++;
            }
        }

        // Create a 1D String array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // Only include unique characters
                result[index++] = chars[i] + ": " + frequencies[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the character frequencies
        String[] frequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character Frequencies:");
        for (String freq : frequencies) {
            System.out.println(freq);
        }

    }
}
