/* Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and 
show the result from both computations is correct. 
Hint => 
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2 
Compare the two results and print the result
*/

import java.util.*;
public class NaturalNumSum{
	
	public static int findSumOfNaturalSum(int number){
		int sum =0;
		if(number==0){
			return 0; 
		}
		
		if(number >0){
			sum= number + findSumOfNaturalSum(number-1);
			return sum;
		}
		return -1;
	}
	
	public static boolean checkNatural(int number){
		if(number>0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String []args){
		
		//creating object of scanner class for taking input
        Scanner input = new Scanner(System.in); 
        
		System.out.println("Enter the number : ");
        int number = input.nextInt();
		
		boolean checknaturalNumber = NaturalNumSum.checkNatural(number);
		int sumOfNaturalNumber =0;
		if(checknaturalNumber ==true){
			 sumOfNaturalNumber = NaturalNumSum.findSumOfNaturalSum(number);
		}else{
			System.out.println("The given number is not a natural number");
		}
		
		
		int sumOfnaturalNumberByFormula= number*(number +1)/2;
		
		if(sumOfNaturalNumber == sumOfnaturalNumberByFormula){
			System.out.println("Result by using recursive method : "+sumOfNaturalNumber);
			System.out.println("Result by using formula  : "+sumOfnaturalNumberByFormula);
			 System.out.println("Therefore both computations is correct"); 
		}else{
			System.out.println("Result by using recursive method : "+sumOfNaturalNumber);
			System.out.println("Result by using formula  : "+sumOfnaturalNumberByFormula);
			System.out.println(" Both computations is not equal, Therefore not equal "); 
		}
	}
}