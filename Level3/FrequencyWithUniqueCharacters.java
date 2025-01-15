/*Write a program to find the frequency of characters in a string using unique characters and display the result
Hint => 
Create a method to Find unique characters in a string using charAt() method 
and return them as 1D array.  Use Nested Loops to find the unique characters in the text
Create a method to find the frequency of characters in a string and return the

 characters and their frequencies in a 2D array. The logic used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values
 of characters are used as indexes in the array to store the frequency of each
 character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Call the uniqueCharacters() method to find the unique characters in the text
Create a 2D String array to store the unique characters and their frequencies. 
Loop through the unique characters and store the characters and their frequencies
In the main function take user inputs, call user-defined methods, and displays 
result.  
*/
import java.util.Scanner;

public class FrequencyWithUniqueCharacters {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] temp = new char[n];
        int uniqueCount = 0;

        // Nested loop to find unique characters
        for (int i = 0; i < n; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already present in temp
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // Add to temp if unique
            if (isUnique) {
                temp[uniqueCount++] = currentChar;
            }
        }

        // Create an array of exact size to store unique characters
        char[] unique = new char[uniqueCount];
        System.arraycopy(temp, 0, unique, 0, uniqueCount);

        return unique;
    }

    // Method to find the frequency of characters using unique characters
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = uniqueCharacters(text); // Find unique characters
        String[][] result = new String[uniqueChars.length][2];

        // Calculate frequencies
        for (int i = 0; i < uniqueChars.length; i++) {
            char uniqueChar = uniqueChars[i];
            int frequency = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == uniqueChar) {
                    frequency++;
                }
            }

            // Store unique character and its frequency in the 2D array
            result[i][0] = String.valueOf(uniqueChar);
            result[i][1] = String.valueOf(frequency);
        }

        return result;
    }

    // Method to display the frequency of characters
    public static void displayFrequencies(String[][] frequencies) {
        System.out.println("Character\tFrequency");
        for (String[] entry : frequencies) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find frequencies
        String[][] frequencies = findCharacterFrequency(input);

        // Display the result
        System.out.println("Character Frequencies:");
        displayFrequencies(frequencies);

        scanner.close();
    }
}
