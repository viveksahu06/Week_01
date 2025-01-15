/*
 * Write a program to split the text into words and find the shortest and
 * longest strings in a given text
 * Hint =>
 * Take user input using the Scanner nextLine() method
 * Create a Method to split the text into words using the charAt() method
 * without using the String built-in split() method and return the words.
 * Create a method to find and return a string's length without using the
 * length() method.
 * Create a method to take the word array and return a 2D String array of the
 * word and its corresponding length. Use String built-in function
 * String.valueOf() to generate the String value for the number
 * Create a Method that takes the 2D array of word and corresponding length as
 * parameters, find the shortest and longest string and return them in an 1D int
 * array.
 * The main function calls the user-defined methods and displays the result.
 */

import java.util.Scanner;

public class SplitAndFindShotestAndLogest {

  // Method to split text into words using charAt() method
  public static String[] splitText(String text) {
    StringBuilder word = new StringBuilder();
    int wordCount = 0;

    // Counting the number of words
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) != ' ') {
        word.append(text.charAt(i));
      } else if (word.length() > 0) {
        wordCount++;
        // StringBuilder method is used to set empty string
        word.setLength(0);
      }
    }
    if (word.length() > 0) {
      wordCount++;
    }

    // Spliting the text into words
    String[] words = new String[wordCount];
    int index = 0;
    word.setLength(0);

    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) != ' ') {
        word.append(text.charAt(i));
      } else if (word.length() > 0) {
        words[index++] = word.toString();
        word.setLength(0);
      }
    }
    if (word.length() > 0) {
      words[index] = word.toString();
    }

    return words;
  }

  // Method to calculate the length of a string without using length() method
  public static int calculateLength(String str) {
    int length = 0;
    for (char c : str.toCharArray()) {
      length++;
    }
    return length;
  }

  // Method to create a 2D array with words and their lengths
  public static String[][] mapWordsToLengths(String[] words) {
    String[][] wordLengths = new String[words.length][2];

    for (int i = 0; i < words.length; i++) {
      wordLengths[i][0] = words[i];
      wordLengths[i][1] = String.valueOf(calculateLength(words[i]));
    }

    return wordLengths;
  }

  // Method to find the shortest and longest words
  public static String[] findShortestAndLongest(String[][] wordLengths) {
    String shortest = wordLengths[0][0];
    String longest = wordLengths[0][0];

    for (String[] entry : wordLengths) {
      if (calculateLength(entry[0]) < calculateLength(shortest)) {
        shortest = entry[0];
      }
      if (calculateLength(entry[0]) > calculateLength(longest)) {
        longest = entry[0];
      }
    }

    return new String[] { shortest, longest };
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Takeing user input
    System.out.println("Enter a text:");
    String inputText = scanner.nextLine();

    // Spliting text into words
    String[] words = splitText(inputText);

    // Maping words to their lengths
    String[][] wordLengths = mapWordsToLengths(words);

    // Finding shortest and longest words
    String[] result = findShortestAndLongest(wordLengths);

    // Displaying the result
    System.out.println("Shortest word: " + result[0]);
    System.out.println("Longest word: " + result[1]);

    scanner.close();
  }
}
