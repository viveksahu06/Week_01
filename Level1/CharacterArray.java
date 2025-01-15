/*Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint => 
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray() 
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in ​​toCharArray() method, compare the 2 arrays, and finally display the result
*/

import java.util.Scanner;

public class CharacterArray {

    // Method to return the characters in a string without using toCharArray()
    public char[] charInString(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) { // Fix loop condition to avoid ArrayIndexOutOfBoundsException
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    // Method to compare two character arrays and return a boolean result
    public boolean compareTwoArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user for the string
        System.out.print("Enter the string: ");
        String s = input.next();

        CharacterArray ca = new CharacterArray();

        // Using the user-defined method to convert string to character array
        char[] userDefinedArray = ca.charInString(s);

        // Using the built-in toCharArray() method
        char[] builtInArray = s.toCharArray();

        // Displaying the results
        System.out.println("User-defined charInString() method result: ");
        System.out.println(userDefinedArray);

        System.out.println("Built-in toCharArray() method result: ");
        System.out.println(builtInArray);

        // Comparing the two arrays
        boolean result = ca.compareTwoArrays(userDefinedArray, builtInArray);
        System.out.println("Are the arrays identical? " + result);
    }
}
