/*
Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint => 
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result 

*/
import java.util.Scanner;

public class ComparingTwoString{
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
		
		//Taking input from the user for String 1 and String 2
		System.out.print("Enter string 1 : ");
		String s1 = input.next();
		
		System.out.print("Enter string 2 : ");
		String s2 = input.next();
		
		boolean equalsComp = s1.equals(s2);
		if(equalsComp){
			System.out.println("Using equals() - String 1 and String 2 are same.");
		}
		else{
			System.out.print("Using equals() - String 1 and String 2 are different.");
		}		
		
		ComparingTwoString s = new ComparingTwoString();
		if(s.compareTwoString(s1 , s2)){
			System.out.println("Using charAt() - String 1 and String 2 are same.");
		}
		else{
			System.out.print("Using charAt() - String 1 and String 2 are different.");
		}
	}
}