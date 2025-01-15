/*Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint => 
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result
*/
import java.util.Scanner;

public class CreateSubString{
    // Method to create a substring using charAt()
	public String createSubString(String s, int startIndex, int endIndex){
        StringBuilder substring = new StringBuilder();
        for (int i = startIndex; i < endIndex; i++) {
            substring.append(s.charAt(i));
        }
        return substring.toString();
    }
	public boolean compareTwoString(String s1, String s2){
        // Checking if the lengths of the strings are different
        if (s1.length() != s2.length()) {
            return false;
        }

        // Comparing each character in both strings
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true; // Strings are identical
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Taking input from the user for string s
		System.out.print("Enter the string : ");
		String s = input.next();
		
		System.out.println("Enter start index : ");
		int startIndex = input.nextInt();
		System.out.println("Enter end index : ");
		int endIndex = input.nextInt();
		
		CreateSubString sc = new CreateSubString();
		String s1=sc.createSubString(s, startIndex, endIndex);
		String s2=s.substring(startIndex, endIndex);
		
		//Printing result
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(	sc.compareTwoString(s1, s2));
	}
}