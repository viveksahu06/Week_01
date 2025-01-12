/*An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint => 
Take user input for 3 sides of a triangle 
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run
*/
import java.util.Scanner;

public class AtheleteRun{
	public double noOfRounds(double perimeter){
		return 5000 / perimeter ;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking sides of triangle as input
		System.out.println("Enter 1st side of triangle : " );
		double side1 = input.nextDouble();
		System.out.println("Enter 2nd side of triangle : " );
		double side2 = input.nextDouble();
		System.out.println("Enter 3rd side of triangle : " );
		double side3 = input.nextDouble();
		
		//calculating perimeter of triangle in km
		double perimeter = side1 + side2 + side3 ;
		
		//creating object nor of class AtheleteRun
		AtheleteRun nor = new AtheleteRun();
		
		//calling method noOfRounds
		double round = nor.noOfRounds(perimeter);
		
		//displaying no of round
		System.out.println("No of rounds athelete must complete : " + round);
	}
}