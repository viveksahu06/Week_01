/*
Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. 
Use Math.random(), Math.min(), and Math.max().
Hint => 
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array 
public double[] findAverageMinMax(int[] numbers) */

import java.util.*;
//import java.util.Scanner;
public class RandomDigitOperation{
	// defining the method to find the random number and storing into the array
	public static int [] randomDigitGenerate(int size){
		
		int randomValues[] = new int[size];
		for(int i=0;i<randomValues.length;i++){
			randomValues[i]= (int)(Math.random()*9001)+1000;
		}
		return randomValues;
	}
	
	// defining the method to find the average of the random generated value of the array
	public static double randomDigitAverage(int []number){
		int sum=0;
		for(int num : number){
			sum +=num;
		}
		double average = (double) sum/number.length;
		return average;
		
	}
	// defining the method to find the minimum value from  the random generated value of the array
	public static int randomDigitMin(int []number){
		int min=number[0];
		for(int num : number){
			 min =(int) Math.min(min,num);
		}
		return min;
	}
	// defining the method to find the maximum value from  the random generated value of the array
	public static int randomDigitMax(int []number){
		int max=number[0];
		for(int num : number){
			 max =(int) Math.max(max,num);
		}
		return max;
	}
    public static void main(String []args){
	
	// createing the scanner class object for taking the input
	Scanner input = new Scanner(System.in);
	//taking the input o the size of the array
	System.out.println("Enter the Size of array : ");
	
	int size= input.nextInt();
	// array for storing the random generated values 
	int randomDigit[]= RandomDigitOperation.randomDigitGenerate(size);
	
	// storing the average minimum maximum value from the generated random value array
	double average = randomDigitAverage(randomDigit);
	int minimum = randomDigitMin(randomDigit);
	int maximum = randomDigitMax(randomDigit);
	
	// printing the array
	System.out.println("The average of random generated values : " +average);
	System.out.println("The minimum of random generated values : " +minimum);
	System.out.println("The maximium of random generated values : " +maximum);
	
	
	
}
  
}