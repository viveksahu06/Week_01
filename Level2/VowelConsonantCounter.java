/*Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
Hint => 
Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 
 */

import java.util.Scanner;

public class VowelConsonantCounter {

  // Method to check if a character is a vowel, consonant, or not a letter
  public static String checkCharacterType(char ch) {
    char lowerChar = Character.toLowerCase(ch); // Convert character to lowercase

    if (lowerChar >= 'a' && lowerChar <= 'z') { // Check if it's a letter
      if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
        return "Vowel";
      } else {
        return "Consonant";
      }
    }
    return "Not a Letter";
  }

  // Method to count vowels and consonants in a string
  public static int[] countVowelsAndConsonants(String text) {
    int vowels = 0, consonants = 0;

    for (int i = 0; i < text.length(); i++) {
      char currentChar = text.charAt(i);
      String charType = checkCharacterType(currentChar);

      if ("Vowel".equals(charType)) {
        vowels++;
      } else if ("Consonant".equals(charType)) {
        consonants++;
      }
    }

    return new int[] { vowels, consonants };
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Takeing user input
    System.out.println("Enter a string:");
    String inputText = scanner.nextLine();

    // Counting vowels and consonants
    int[] result = countVowelsAndConsonants(inputText);

    // Displaying the results
    System.out.println("Number of vowels: " + result[0]);
    System.out.println("Number of consonants: " + result[1]);

    scanner.close();
  }
}
