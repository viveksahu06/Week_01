/*Write a program to demonstrate StringIndexOutOfBoundsException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Access the index using charAt() beyond the length of the String. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate StringIndexOutOfBoundsException. Access the index using charAt() beyond the length of the String. Then write try catch block for Exception while accessing the String method
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.Scanner;

public class ShowingStringIndexOutOfBoundsException{
	public void generateException(String s){
		char ch=  s.charAt(s.length()+1);
		System.out.println("Generated error : " + ch);
	}
	public void demonstrateException(String s){
		char k = s.charAt(s.length()+1);
		try{
			System.out.println("Attempting to get the char beyond the length of string");
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException caught : " + e.getMessage());
		}
	}
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		//Taking input string s
		System.out.print("Enter the string: ");
		String s = input.nextLine();
		
		ShowingStringIndexOutOfBoundsException sibe = new ShowingStringIndexOutOfBoundsException();
		
		sibe.generateException(s);
		sibe.demonstrateException(s);	
	}
}