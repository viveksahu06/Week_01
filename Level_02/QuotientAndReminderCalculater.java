/*Write a program to take 2 numbers and print their quotient and reminder
Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
*/
import java.util.Scanner; 
public class QuotientAndReminderCalculater{
	public static void main(String []args){
		//Create scanner to take input
		Scanner sc=new Scanner(System.in); 
		//taking input first number 
		System.out.print("Enter the first number: ");
		int number1=sc.nextInt();
		
		//taking input second number 
		System.out.print("Enter the second number: ");
		int number2=sc.nextInt();
		
		//Display Result 
		System.out.println("The Quotient is "+ number1/number2 +" and Remainder is " + number1%number2+" of two number " + number1 +
		" and " + number2);
				
	}
    
}