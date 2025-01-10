/* Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint => 
Create a number variable and Take user input. 
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number
*/

//importing the scanner class
import java.util.Arrays;
import java.util.Scanner;
public class DigitsArray{
   public static void main(String []args){
        // creating scanner class object for taking input
        Scanner sc = new Scanner(System.in);  
		
		//taking the number from user to store its digit into array
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		//value of is a method which is used to convert number into string and length method is used to find length of string
		int numDigit= String.valueOf(number).length();
		
		int digitArr[]=new int[numDigit];
		
		int i=0;
		while(number>0){
			int digit = number%10;
			digitArr[i]=digit;
			
			number=number/10;
			i++;
		}
		int largestValue=Integer.MIN_VALUE;
		int secondLargestValue= Integer.MIN_VALUE;
		
		//running the loop for finding largest and second largest value from a array
		for(int j=0;j<numDigit;j++){
		    if(digitArr[j]>largestValue){
				secondLargestValue=largestValue;
				largestValue=digitArr[j];
				
			}
			else if(digitArr[j]>secondLargestValue && digitArr[j]!=largestValue){
				secondLargestValue=digitArr[j];
			}
		}
		//printing the result
		System.out.println("The largest digit from given number : "+largestValue+" and second largest value : "+secondLargestValue);
   }


}