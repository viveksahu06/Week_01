/*Write a program to find the frequency of characters in a string using charAt() method and display the result
Hint => 
Create a method to find the frequency of characters in a string using charAt()
 method and return the characters and their frequencies in a 2D array. The logic 
 used here is as follows:
Create an array to store the frequency of characters in the text. ASCII values of 
characters are used as indexes in the array to store the frequency of each 
character. There are 256 ASCII characters
Loop through the text to find the frequency of characters in the text
Create an array to store the characters and their frequencies
Loop through the characters in the text and store the characters and their 
frequencies
In the main function take user inputs, call user-defined methods, and displays
 result.  
*/
import java.util.Scanner;

public class CharacterFrequency {

    // Method to calculate the frequency of characters in a string
    public static int[][] calculateFrequency(String text) {
        int[] frequency = new int[256]; // Array to store frequency of each ASCII character

        // Loop to calculate frequency using ASCII values as indexes
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        int[][] result = new int[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = i;       // ASCII value of the character
                result[index][1] = frequency[i]; // Frequency of the character
                index++;
            }
        }

        return result;
    }

    // Method to display the characters and their frequencies
    public static void displayFrequencies(int[][] charFreq) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < charFreq.length; i++) {
            System.out.println((char) charFreq[i][0] + "\t\t" + charFreq[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Calculate frequency of characters
        int[][] frequencies = calculateFrequency(input);

        // Display the characters and their frequencies
        System.out.println("Character Frequencies:");
        displayFrequencies(frequencies);

    }
}
