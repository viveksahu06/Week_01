/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different 
methods and display results. Make sure all are static methods
Hint => 
Method to Find the count of digits in the number
Method to Store the digits of the number in a digits array
Method to Check if a number is a duck number using the digits array.
 A duck number is a number that has a non-zero digit present in it
Method to check if the number is a armstrong number using the digits array. 

​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of 

digits. Eg: 153 = 1^3 + 5^3 + 3^3
Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize
 the variable.
Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to 
initialize the variable.*/

import java.util.Scanner;
public class NumberChecker{
	//Find the count of digits in the number
	public static int countDigits(int number){
		int lengthOfNumber= String.valueOf(number).length();
		
		return lengthOfNumber;
	}
	
	//to store the digits of the number in a digits array
	public static void digitArrayStore(int number,int digitArray[]){ 
		int lengthOfNumber=countDigits(number); 
		
		for(int i=lengthOfNumber-1;i>=0;i--){
			digitArray[i]=number%10;
			number/=10;
		}
	
	}
	
	//to Check if a number is a duck number using the digits array.
	/*as per condition A duck number is a positive integer that contains at least one zero,
	but does not start with a zero. For example, 
	6302, 6540, 7670768, and 10209 are all duck numbers, but 045 and 0010 are not. */
	
    public static boolean checkDuckNumber(int digitArray[]){
		int numOfZero=0;
		for(int i=0; i<digitArray.length;i++){
			if(digitArray[i]==0) numOfZero++; 
			
		}  
		if(digitArray[0]!=0 && numOfZero >0) return true;
		return false;
	}
	
	//Method to check if the number is a armstrong number using the digits array.
	
	public static boolean checkArmstrong(int digitArray[],int number){
		
		int digitArmSum=0; 
		for(int i=0;i<digitArray.length;i++){
			digitArmSum+=Math.pow(digitArray[i],digitArray.length);
		} 
		
		return digitArmSum==number;
		
	}
	
	//Method to find the largest and second largest elements in the digits array.
	
	public static void firstAndSecondLargest(int digitArray[]){
		int firstLargest=Integer.MIN_VALUE; 
		int secondLargest=Integer.MIN_VALUE; 
		
		for(int i=0;i<digitArray.length;i++){
			int number= digitArray[i]; 
			if(number > firstLargest){  
				secondLargest= firstLargest; 
				firstLargest=number;
			} 
			else if(number > secondLargest && number!= firstLargest){
				secondLargest = number;
			}
		} 
		
		System.out.print("the first and second largest number in digit array is " + firstLargest + " & " + secondLargest);
	}
	
	//Method to find the the smallest and second smallest elements in the digits array.
	
	public static void firstAndSecondSmallest(int digitArray[]){
		int firstSmallest=Integer.MAX_VALUE; 
		int secondSmallest=Integer.MAX_VALUE; 
		
		for(int i=0;i<digitArray.length;i++){
			int number= digitArray[i]; 
			if(number < firstSmallest){  
				secondSmallest= firstSmallest; 
				firstSmallest=number;
			} 
			else if(number < secondSmallest && number!= firstSmallest){
				secondSmallest = number;
			}
		} 
		
		System.out.print ("the first and second smallest number in digit array is " + firstSmallest + " & " + secondSmallest);
	}
	
	

	public static void main(String []args){
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a number: "); 
		int number = sc.nextInt(); 
		
		System.out.println(); 
		int lengthOfNumber= String.valueOf(number).length();
		int digitArray[]= new int[lengthOfNumber];
		
		// Displaying the result to find the count of digits in the number 
		System.out.println("In a number "+ number +" there are " + countDigits(number) + " digits"); 
		
		// Displaying the result to  Store the digits of the number in a digits array 
		digitArrayStore(number,digitArray);
		System.out.print("Number all digits are ");
		for(int i=0;i<digitArray.length;i++){
			System.out.print(digitArray[i]+" "); 
		}
		System.out.println(); 
		
		//Displaying the result to Check if a number is a duck number using the digits array.  
		if(checkDuckNumber(digitArray)){
			System.out.println("Given number "+ number +" is a duck number ");
		}
		else{
			System.out.println("Given number "+ number +" is not a duck number ");
		} 
		
		
		//Displaying the result to check if the number is a armstrong number  
		if(checkArmstrong(digitArray,number)){
			System.out.println("Given number "+ number +" is a armstrong number ");
		} 
		else{
			System.out.println("Given number "+ number +" is not a armstrong number ");
		} 
		
		
		//Displaying the result to to find the largest and second largest elements in the digits array 
		System.out.print("In a Given number "+ number  + " after it's digit array ");
		firstAndSecondLargest(digitArray);
		
		//New line
		System.out.println(); 
		//Displaying the result to to find the smallest and second smallest elements in the digits array
		System.out.print("In a Given number "+ number  + " after it's digit array " );
		firstAndSecondSmallest(digitArray);
		
	}
}