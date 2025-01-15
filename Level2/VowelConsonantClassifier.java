/*
 * Write a program to find vowels and consonants in a string and display the
 * character type - Vowel, Consonant, or Not a Letter
 * Hint =>
 * Create a method to check if the character is a vowel or consonant and return
 * the result. The logic used here is as follows:
 * Convert the character to lowercase if it is an uppercase letter using the
 * ASCII values of the characters
 * Check if the character is a vowel or consonant and return Vowel, Consonant,
 * or Not a Letter
 * Create a Method to find vowels and consonants in a string using charAt()
 * method and return the character and vowel or consonant in a 2D array
 * Create a Method to display the 2D Array of Strings in a Tabular Format
 * Finally, the main function takes user inputs, calls the user-defined methods,
 * and displays the result.
 */

 import java.util.Scanner;

public class VowelConsonantClassifier {

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

  // Method to classify characters in a string and return a 2D array
  public static String[][] classifyCharacters(String text) {
    String[][] result = new String[text.length()][2];

    for (int i = 0; i < text.length(); i++) {
      char currentChar = text.charAt(i);
      result[i][0] = String.valueOf(currentChar);
      result[i][1] = checkCharacterType(currentChar);
    }

    return result;
  }

  // Method to display the 2D array in a tabular format
  public static void displayClassification(String[][] classification) {
    System.out.println("Character\tType");
   

    for (String[] entry : classification) {
      System.out.println(entry[0] + "\t\t" + entry[1]);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Taking user input
    System.out.println("Enter a string:");
    String inputText = scanner.nextLine();

    // Classifying characters in the string
    String[][] classification = classifyCharacters(inputText);

    // Displaying the classification result
    displayClassification(classification);

    scanner.close();
  }
}
