/*Write a program that take input a year as sc and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
*/

//impoting scanner class
import java.util.Scanner;
public class CheckLeapYear{
	
	  public static boolean leapyearChecking(int year){
		  if((year%4==0 && (year%100) !=0) || year%400==0){
			  return true;
		  }
		  return false;
	  }
	 
      public static void main(String args[]){
	    
		
		//creating object of scanner class for taking sc
        Scanner sc = new Scanner(System.in); 
        
		//taking sc from user and storing in number variable
		System.out.println("Enter the Year : ");
        int year = sc.nextInt();
		
		
		boolean checkLeapYear=false;
		// storing result wheather given year is leap year or not
		if(year>=1582){
			 checkLeapYear = CheckLeapYear.leapyearChecking(year);
		}
		else{
			System.out.println("The given year " +year+ " belongs to Gregorian calender");
			System.exit(0);
		}
		
		if(checkLeapYear){
			System.out.println("The Given Year " +year+ " is a Leap year ");
			
		}
		else{
						System.out.println("The Given Year " +year+ " is not a Leap year ");

		}
		
	  }
}