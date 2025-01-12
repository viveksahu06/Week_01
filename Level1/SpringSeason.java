/*
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 
*/
import java.util.Scanner;

public class SpringSeason{
	public boolean seasonCheck(int month, int day){
        return ((month == 3 && day >= 20)||(month == 4) ||(month == 5) || month == 6 && day <= 20);
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking input form user
		System.out.println("Please provide month : ");
		int month = input.nextInt();
		System.out.println("Please provide day : ");
		int day = input.nextInt();
		
		//creating object season of class SpringSeason
		SpringSeason season = new SpringSeason();
		
		//calling method and displaying result
		if (season.seasonCheck(month , day)){
            System.out.println("Its a Spring Season");
        }
		else {
            System.out.println("Not a Spring Season");
        }
	}
}