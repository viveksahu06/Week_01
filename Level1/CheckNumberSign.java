/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero.
 Further for positive numbers check if the number is even or odd. 
 Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
*/
import java.util.Scanner;
public class CheckNumberSign{
	public static void main(String []args){
		//Defining Scanner class
		Scanner sc=new Scanner(System.in); 
		
		//Defining array of size 5
		int number[] = new int [5]; 
		
		//Taking number input from user 
		System.out.print("Enter 5 numbers ");
		for(int i=0;i<number.length;i++){
			number[i]=sc.nextInt();
		}
		
		//checking sign and apply manipulation
		for(int i=0;i<number.length;i++){
			if(number[i]>0){
				System.out.print("Given number "+number[i] +" is a positive number ");
				//Here number is positive, check for even or odd numbers 
				if(number[i]%2==0){
					System.out.println("and this number is a even number");
				}
				else{
					System.out.println("and this number is a odd number");
				}
			}
			else if(number[i]<0){
				System.out.println("Given number "+number[i] +" is a negative number");
			}
			else{
				System.out.println("Given number "+number[i] +" is " + 0);
			}
		} 
		
		int firstNo=number[0]; 
		int lastNo=number[number.length-1]; 
		
		//comparing first and last value of number  
		if(firstNo==lastNo){
			System.out.println("Both first and last values are equal");
		}
		else if(firstNo > lastNo){
			System.out.println("First number "+ firstNo +" is greater than the last number " + lastNo); 
		}
		else{
			System.out.println("First number "+ firstNo +" is lesser than the last number " + lastNo); 
		}
		
	}
}