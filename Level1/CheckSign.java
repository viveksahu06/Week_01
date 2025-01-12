/*Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero
*/

import java.util.Scanner;

public class CheckSign{
	public int signOfNumber(int number){
		if (number > 0){
			return 1;
		}
		else if (number < 0 ){
			return -1;
		}
		else{
			return 0;
		}
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking input number
		System.out.println("Enter the number : ");
		int number = input.nextInt();
		
		//creating noSign object of CheckSign class
		CheckSign noSign = new CheckSign();
		
		//Calculating and displaying result
		System.out.println("The result of numvber entere : " + noSign.signOfNumber(number));
	}
}