

import java.util.Scanner;

public class TextSplitAndLength2D {

    // Method to split text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        // Count the number of words first
        int length = calculateLength(text);
        int wordCount = 1;

        // Count words by checking spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store the words
        String[] words = new String[wordCount];
        int wordIndex = 0, start = 0;

        // Extract words using indexes
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        // Add the last word
        words[wordIndex] = text.substring(start);

        return words;
    }
	
    // Method to find and return the length of a string without using length()
    public static int calculateLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D String array with words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(calculateLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a text: ");
        String inputText = input.nextLine();

        // Split text into words
        String[] words = splitTextIntoWords(inputText);

        // Get words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display results in a tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println(wordWithLength[0] + "\t" + Integer.parseInt(wordWithLength[1]));
        }

        input.close();
    }
}

