/*Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException
*/
import java.util.Scanner;

public class ShowingArrayIndexOutOfBoundsException{
	public void generateException(String[] arr){
	System.out.println(arr[arr.length]);
	}
	public void demonstrateException(String[] arr){
		try{
			System.out.println("Demonstrating exception handling" + arr[arr.length]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
		}
	}
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter the number of names");
		int size = input.nextInt();
		
		String[] names = new String[size];
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = input.nextLine();
        }
		
		ShowingArrayIndexOutOfBoundsException aibe = new ShowingArrayIndexOutOfBoundsException();
		aibe.generateException(names);
		aibe.demonstrateException(names);
	}
}