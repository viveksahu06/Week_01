/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/
import java.util.Scanner;

public class MaxNoHandshakes2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking input number
		System.out.println("Enter the number :");
		int number = input.nextInt();
		
		//calculating no of handshakes
		int noOfHandshakes = ( number * ( number - 1 ) ) / 2;
		
		//displaying no of Handshakes
		System.out.println("Number of handshakes = " + noOfHandshakes);
	}
}