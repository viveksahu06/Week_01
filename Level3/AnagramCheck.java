/*Write a program to check if two texts are anagrams and display the result
Hint => 
Anagram is a word or phrase formed by rearranging the same letters to form 
different words or phrase,
Write a method to check if two texts are anagrams. The logic used here is as
 follows:
Check if the lengths of the two texts are equal
Create an array to store the frequency of characters in the strings for the
 two text
Find the frequency of characters in the two texts using the loop
Compare the frequency of characters in the two texts. If the frequencies are
 not equal, return false
In the main function take user inputs, call user-defined methods, and displays 
result.
*/
import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert both texts to lowercase for case-insensitive comparison
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create an array to store frequency of characters for both strings
        int[] frequency1 = new int[256];  // ASCII character set
        int[] frequency2 = new int[256];

        // Count the frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequencies of characters in both texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        // If frequencies are equal, the texts are anagrams
        return true;
    }

    public static void main(String[] args) {
        // Take user input for two texts
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Check if the texts are anagrams
        if (areAnagrams(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

    }
}
