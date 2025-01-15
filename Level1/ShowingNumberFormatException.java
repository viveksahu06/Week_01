/*Write a program to demonstrate NumberFormatException
Hint => 
Define a variable to take user input as a String 
Use Integer.parseInt() to generate this exception. Integer.parseInt() is a built-in function in java.lang.Integer class to extract the number from text. In case the text does not contain numbers the method will throw NumberFormatException which is a runtime exception
Write a Method to generate the Exception. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate NumberFormatException. Use Integer.parseInt(text) to extract number from the text. This will generate a runtime exception. Use the try-catch block to handle the NumberFormatException as well as the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.Scanner;

public class ShowingNumberFormatException{
	public void generateException(String s){
		System.out.println("Generated error : " + Integer.parseInt(s));
	}
	
	public void demonstrateException(String s){
		Integer.parseInt(s);
		try{
			System.out.println("Attempting to get number form  the text does not contain numbers");
		}
		catch(IllegalArgumentException e){
			System.out.println("NumberFormatException : " + e.getMessage());
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input string s
		System.out.println("Enter the string: ");
		String s = input.nextLine();
		
		//calling methods
		ShowingNumberFormatException nfe = new ShowingNumberFormatException();
		nfe.generateException(s);
		nfe.demonstrateException(s);
	}
}