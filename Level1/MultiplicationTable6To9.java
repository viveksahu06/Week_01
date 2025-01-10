/*Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint => 
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___
*/
import java.util.Scanner; 
public class MultiplicationTable6To9{
	public static void main(String []args){
		//Defining Scanner class
		Scanner sc=new Scanner(System.in); 
		
		//Getting number input from user to make multiplication table 6 to 9
		System.out.print("Enter no. who's multiplication table you want: "); 
		int number= sc.nextInt(); 
		
		//Creating array of size 10 for storing it's table value
		int resultTable[] =new int[4]; 
		
		//storing it's table value in array 
		for(int i=6;i<=9;i++){
			resultTable[i-6]=number*i;
		}
		
		//printing the resultant multiplication table of a number 
		System.out.println("Table of a number " +number +" from 6 to 9 is ");
		for(int i=6;i<=9;i++){
			System.out.println(number +" * " + i +" = " + resultTable[i-6]);
		}
	}
}