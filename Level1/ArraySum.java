/*Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. 
Show all the numbers as well as the sum of all numbers 
Hint => 
Create a variable to store an array of 10 elements of type double as well as a variable to
 store the total of type double initializes to 0.0. Also, the index variable is initialized to 0 for the array
Use infinite while loop as in while (true)
Take the user entry and check if the user entered 0 or a negative number to break the loop 
Also, break from the loop if the index has a value of 10 as the array size is limited to 10.
If the user entered a number other than 0 or a negative number inside the while loop then
assign the number to the array element and increment the index value
Take another for loop to get the values of each element and add it to the total 
Finally display the total value
*/ 

import java.util.Scanner;
public class ArraySum{
	public static void main(String []arhs){
		//Defining Scanner class
		Scanner sc=new Scanner(System.in); 
		//Declaring array size 10 to store values
		double number[]=new double[10]; 
		
		//Declaring idx variable to track array idx
		int idx=0; 
		double totalSumOfNumber=0.0; 
		
        System.out.println("Enter up to 10 numbers 0 or a negative number to stop:");
		while(true){  	
			
			if(idx==10){
				System.out.println("array is full can not further enter next value "); 
				break;
			} 
			double input=sc.nextDouble();
			if(input<=0){
				break;
			} 
			
			
			number[idx++]=input;
				
			} 
			
			for(int i=0;i<10;i++){
				totalSumOfNumber+=number[i];
		}
		
		//Displaying original added value
		System.out.print("Original values of the array is : ");
		for(int i=0;i<idx;i++){
			System.out.print(number[i]+" ");
		} 
		
		//Dispalying the total of given number 
		System.out.println("\n The total sum of entered number is " + totalSumOfNumber);
		
	}
}