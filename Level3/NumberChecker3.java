/*Extend or Create a NumberChecker utility class and perform following task.
Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of
 the number in a digits array
Method to find the sum of the digits of a number using the digits array
Method to find the sum of the squares of the digits of a number using the digits array. Use Math.pow() method
Method to Check if a number is a harshad number using a digits array. A number is called a Harshad 
number if it is divisible by the sum of its digits. For e.g. 21
Method to find the frequency of each digit in the number. Create a 2D array to store the 
frequency with digit in the first column and frequency in the second column.
*/
import java.util.Scanner;
public class NumberChecker3{
	//Method to find the count of digits in the number 
	public static int countDigits(int number){
		int lengthOfNumber= String.valueOf(number).length();
		
		return lengthOfNumber;
	}
	
	//Method to store the digits of the number in a digits array
	public static void digitArrayStore(int number,int digitArray[]){ 
		int lengthOfNumber=countDigits(number); 
		
		for(int i=lengthOfNumber-1;i>=0;i--){
			digitArray[i]=number%10;
			number/=10;
		}
	}
	
	//method to find sum of digits
	public  static int sumOfDigits(int digits[]){
		int sum=0; 
		int size = digits.length; 
		
		//calculating sum 
		for(int i=0;i<size;i++){
			sum+=digits[i];
		} 
		return sum;
	}
	
	//Method to find the sum of the squares of the digits of a number using the digits array.
	public  static int sumOfSquareOfDigits(int digits[]){
		int sum=0; 
		int size = digits.length; 
		
		//calculating sum 
		for(int i=0;i<size;i++){
			sum+=Math.pow(digits[i],2);
		} 
		return sum;
	}
	
	//Method to Check if a number is a harshad number using a digits array
	//if it is divisible by the sum of its digits. For e.g. 21
	public static boolean checkHarshad(int digitArray[], int number){
		int sumOfDigit= sumOfDigits(digitArray); 
		
		return number%sumOfDigit==0;
	}
	
	//Method to find the frequency of each digit in the number 
	public static void frequencyOfDigit(int digits[]){
		int frequency[][] = new int [digits.length][2];
		int index=0;
		for (int digit : digits) {
			boolean found = false;

			// Check if the digit is already recorded in the frequency array
			for (int i = 0; i < index; i++) {
				if (frequency[i][0] == digit) {
					frequency[i][1]++; 
					found = true;
					break;
				}
			}

			// If the digit is not found, add it as a new entry
			if (!found) {
				frequency[index][0] = digit;
				frequency[index][1] = 1;
				index++;
			}
		}
		for (int i=0;i<index;i++){
			System.out.println("The digit is "+ frequency[i][0] + " and its frequency is " + frequency[i][1]);
		}
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
		
		//sum of digit result 
		System.out.println("Sum of the digits  is " + sumOfDigits(digitArray)); 
		
		//sum of the square of the digits
		System.out.println("Sum of the square of the digits  is " + sumOfSquareOfDigits(digitArray));
		
		//Displaying the result if a number is a harshad number using a digits array 
		if(checkHarshad(digitArray,number)){
			System.out.println("Given number " + number +" is a harshad number");
		}
		else{
			System.out.println("Given number " + number +" is not a harshad number");
		} 
		
		//Displaying the frequency of digit 
		System.out.println("The frequency of the each digit is "); 
		frequencyOfDigit(digitArray);
	}
}