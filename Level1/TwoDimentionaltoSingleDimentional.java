/*
Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array 
into a single dimension array
Hint => 
Take user input for rows and columns, create a 2D array (Matrix), and take the user input 
Copy the elements of the matrix to a 1D array. For this create a 1D array of size rows*columns as in 
int[] array = new int[rows * columns];
Define the index variable and Loop through the 2D array. Copy every element of the 2D array into the 
1D array and increment the index
Note: For looping through the 2D array, you will need Nested for loop, Outer for loop for rows, and the 
inner for loops to access each element
*/ 
import java.util.Scanner; 

public class TwoDimentionaltoSingleDimentional{
	public static void  main(String []args){
		Scanner sc=new Scanner(System.in); 
		//Enter no of rows
		System.out.print("please enter the number of row in your 2D array: "); 
		int numberOfRows= sc.nextInt(); 
		//Enter column
		System.out.print("please enter the number of column in your 2D array: "); 
		int numberOfColumn= sc.nextInt(); 
		
		int matrix[][]= new int[numberOfRows][numberOfColumn]; 
		System.out.println("please enter the value of matrix ");
		//adding value in the 2D matrix 
		for(int i=0;i<numberOfRows;i++){
			for(int j=0;j<numberOfColumn;j++){
				matrix[i][j]=sc.nextInt(); 
			}
		}
		
		//Declaring a single dimentional array of size rows*col 
		int oneDArray[] = new int[numberOfRows*numberOfColumn];
		int idx=0;
		//coping the value 2D to 1D array 
		for(int i=0;i<numberOfRows;i++){
			for(int j=0;j<numberOfColumn;j++){
				oneDArray[idx++]=matrix[i][j];
			}
		} 
		
		
		//Displaying the result
		for(int i=0;i<idx;i++){
			System.out.print(oneDArray[i]+" ");
		}
	}
}