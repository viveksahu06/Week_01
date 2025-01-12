/*
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes
*/

import java.util.Scanner;

public class MaxNoHandshakes{
	//creating method to create no. of handshakes
	public int handshakes(int number){
		return ( number * ( number - 1 ) ) / 2;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//creating object hs of class MaxNoHandshakes
		MaxNoHandshakes hs = new MaxNoHandshakes();
		
		//taking input number from user
		System.out.println("Enter the number :");
		int number = input.nextInt();
		
		//calling method handshakes
		int noOfHandshakes = hs.handshakes(number);
		
		//displaying the result SI
		System.out.println("Number of handshakes = " + noOfHandshakes);
	}
}