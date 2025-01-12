/*
Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor) 
*/
import java.util.Scanner;

public class ChocolateReminderQuotient{
	public static int[] findRemainderAndQuotient(int number, int divisor){
		//calculating quotient or no of chocolates each child will have
		int quotient = number / divisor;
		
		//calculating reminder or the remaining chocolates
		int reminder = number % divisor;
		
		return new int[]{quotient, reminder};
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking input number and divisor from user
		System.out.print("Enter number of chocolates : ");
		int number = input.nextInt();
		System.out.print("Enter number of child : ");
		int divisor = input.nextInt();
		
		//Creating onject rc of class ReminderQuotient
		ReminderQuotient rc = new ReminderQuotient();

        // Finding the quotient and reminder
        int[] result = rc.findRemainderAndQuotient(number, divisor);

        // Displaying the results
        System.out.println("The number of chocolates each child will get is: " + result[0]);
        System.out.println("The number of chocolates remaining is: " + result[1]);		
	}
}