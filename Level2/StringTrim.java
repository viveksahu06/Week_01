/*
 * Write a program to trim the leading and trailing spaces from a string using
 * the charAt() method
 * Hint =>
 * Create a method to trim the leading and trailing spaces from a string using
 * the charAt() method. Inside the method run a couple of loops to trim leading
 * and trailing spaces and determine the starting and ending points with no
 * spaces. Return the start point and end point in an array
 * Write a method to create a substring from a string using the charAt() method
 * with the string, start, and end index as the parameters
 * Write a method to compare two strings using the charAt() method and return a
 * boolean result
 * The main function calls the user-defined trim and substring methods to get
 * the text after trimming the leading and trailing spaces. Post that use the
 * String built-in method trim() to trim spaces and compare the two strings. And
 * finally display the result
 */

public class StringTrim {

  // Method to trim leading and trailing spaces using charAt()
  public static int[] trimSpaces(String str) {
    int start = 0;
    int end = str.length() - 1;

    // Finding the starting point (first non-space character)
    while (start <= end && str.charAt(start) == ' ') {
      start++;
    }

    // Finding the ending point (last non-space character)
    while (end >= start && str.charAt(end) == ' ') {
      end--;
    }

    return new int[] { start, end };
  }

  // Method to create a substring using charAt() method
  public static String createSubstring(String str, int start, int end) {
    StringBuilder substring = new StringBuilder();
    for (int i = start; i <= end; i++) {
      substring.append(str.charAt(i));
    }
    return substring.toString();
  }

  // Method to compare two strings using charAt() and return a boolean result
  public static boolean compareStrings(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "   Hello World!   ";

    // Trim spaces using custom trimSpaces method
    int[] trimmedIndices = trimSpaces(str);
    String customTrimmed = createSubstring(str, trimmedIndices[0], trimmedIndices[1]);

    // Trim spaces using built-in trim() method
    String builtInTrimmed = str.trim();

    // Comparing both trimmed strings
    boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);

    // Displaying the result
    System.out.println("Original String: \"" + str + "\"");
    System.out.println("Custom Trimmed String: \"" + customTrimmed + "\"");
    System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
    System.out.println("Are both trimmed strings equal? " + areEqual);
  }
}
