/*
Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.Scanner;

public class ShowingIllegalArgumentException{
	public void generateException(String s){
		//Taking random value of startIndex and endIndex, where startIndex > endIndex
		int startIndex = 5;
		int endIndex = 2;
        String substring = s.substring(startIndex, endIndex);
		System.out.println("Generated error : " + substring);
		
	}
	public void demonstrateException(String s){
		//Taking random value of startIndex and endIndex, where startIndex > endIndex
		int startIndex = 5;
		int endIndex = 2;
        String substring = s.substring(startIndex, endIndex);
		try{
			System.out.println("Attempting to  set the start index to be greater than the end index");
		}
		catch(IllegalArgumentException e){
			System.out.println("IllegalArgumentException caught : " + e.getMessage());
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Taking input string s
		System.out.print("Enter the String: ");
		String s = input.nextLine();
		
		//calling methods
		ShowingIllegalArgumentException iae = new ShowingIllegalArgumentException();
		iae.generateException(s);
		iae.demonstrateException(s);
	}
}