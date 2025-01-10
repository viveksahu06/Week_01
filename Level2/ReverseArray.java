/* Create a program to take a number as input and reverse the number. To do this, 
store the digits of the number in an array and display the array in reverse order
Hint => 
Take user input for a number. 
Find the count of digits in the number. 
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order  
*/

//importing the scanner class
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray{
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
		
		
		//running the loop for printing the digit in reverse form
		for(int j=0;j<numDigit;j++){
		    System.out.print(digitArr[j]);
		}
	
   }


}