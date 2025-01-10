/*Create a program to print a multiplication table of a number.
Hint => 
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 10
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___
*/
import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String []args){
		//Defining Scanner class
		Scanner sc=new Scanner(System.in); 
		
		//Getting number input from user to make multiplication table
		System.out.print("Enter no. who's multiplication table you want: "); 
		int number= sc.nextInt(); 
		
		//Creating array of size 10 for storing it's table value
		int resultTable[] =new int[10]; 
		
		//storing it's table value in array 
		for(int i=1;i<=10;i++){
			resultTable[i-1]=number*i;
		}
		
		//printing the resultant multiplication table of a number 
		System.out.println("Table of a number " +number +" is");
		for(int i=1;i<=10;i++){
			System.out.println(number +" * " + i +" = " + resultTable[i-1]);
		}
	}
}
	