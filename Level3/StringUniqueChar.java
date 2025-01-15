/*Find unique characters in a string using charAt() method and display the result
Hint => 
Create a Method to find the length of the text without using the String method 
length()
Create a method to Find unique characters in a string using charAt() method and 
return them as 1D array. The logic used here is as follows:
Create an array to store the unique characters in the text. The size is the length 
of the text
Loops to Find the unique characters in the text. Find the unique characters in the 
text using a nested loop. An outer loop iterates through each character and an 
inner
loop checks if the character is unique by comparing it with the previous 
characters. If the character is unique, it is stored in the result array
Create a new array to store the unique characters 
Finally, the main function takes user inputs, calls the user-defined 
methods, and displays the result.  
*/

import java.util.Scanner;

public class StringUniqueChar {

    // Method to find the length of the string without using the length() method
    public static int strLength(String s) {
        int length = 0;
        for (char c : s.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to find unique characters in the string using charAt() and return them as a 1D array
    public static char[] uniqueChar(String s) {
        int n = strLength(s); // Length of the string
        char[] temp = new char[n]; // Temporary array to store unique characters
        int uniqueCount = 0; // Counter for unique characters

        // Iterate through each character in the string
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            boolean isUnique = true;

            // Check if the character has appeared before
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the temp array
            if (isUnique && currentChar != ' ') {
                temp[uniqueCount++] = currentChar;
            }
        }

        // Create a new array to store only the unique characters
        char[] unique = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    public static void main(String[] args) {
        // Take user input for string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Call strLength to find the length of the string
        int length = strLength(input);
        System.out.println("Length of the string: " + length);

        // Call uniqueChar to find unique characters
        char[] uniqueChars = uniqueChar(input);

        // Display the unique characters
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
