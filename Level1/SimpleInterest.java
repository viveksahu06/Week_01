/*Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”
*/
import java.util.Scanner;

public class SimpleInterest{
	public double calculateSI(double principal, double rate, double time){
		return( principal * rate * time ) / 100 ;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking principal as input from user
		System.out.println("Enter Principal Amount : ");
		double principal = input.nextDouble();
		
		//taking rate as input from user
		System.out.println("Enter Rate of interest : ");
		double rate = input.nextDouble();
		
		//taking time as input from user
		System.out.println("Enter Time : ");
		double time = input.nextDouble();
		
		//Creating a simpleInterest object
		SimpleInterest siCalculator = new SimpleInterest();
		
		//calling the method calculateSI and calculating SI
		double simpleInterest = siCalculator.calculateSI(principal, rate, time);
		
		//Displaying Simple interest
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
		
	}
}
