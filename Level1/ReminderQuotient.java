/*Write a program to take 2 numbers and print their quotient and reminder
Hint => 
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number 
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/
import java.util.Scanner;

public class ReminderQuotient{
	public static int[] findRemainderAndQuotient(int number, int divisor){
		//calculating quotient
		int quotient = number / divisor;
		
		//calculating reminder
		int reminder = number % divisor;
		
		return new int[]{quotient, reminder};
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking input number and divisor from user
		System.out.print("Enter 1st number : ");
		int number = input.nextInt();
		System.out.print("Enter divisor : ");
		int divisor = input.nextInt();
		
		//Creating onject rc of class ReminderQuotient
		ReminderQuotient rc = new ReminderQuotient();

        // Finding the quotient and reminder
        int[] result = rc.findRemainderAndQuotient(number, divisor);

        // Displaying the results
        System.out.println("The quotient is: " + result[0]);
        System.out.println("The reminder is: " + result[1]);		
	}
}