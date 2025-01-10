/*
Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors
Hint => 
Take the input for a number
Find the factors of the number and save them in an array. For this create integer variable maxFactor and initialize to 10, 
factors array of size maxFactor and index variable to reflect the index of the array. 
To find factors loop through the numbers from 1 to the number, find the factors, and add them to the array element by incrementing 
the index. If the index is equal to maxIndex, then need factors array to store more elements
To store more elements, reset the maxIndex to twice its size, use the temp array to store the elements from the factors array, and 
eventually assign the factors array to the temp array
Finally, Display the factors of the number
*/ 
import java.util.Scanner;
public class AllFactorFindingofNumber{
	public static void main(String []args){
		//Declarinng scanner class
		Scanner sc=new Scanner(System.in); 
		
		System.out.print("Enter number whose facters yuo want to find: ");
		//Input from user
		int number=sc.nextInt(); 
		
		//Declaring initial array of size 10 to sotre factors
		
		int factors[]=new int[10]; 
		// for storing element and tracking factor array
		int idx=0;
		int maxFactor=10;
		for (int i = 1; i <= number; i++) {
            if (number % i == 0) { 
                if (idx == maxFactor) {
					//Resizing factor size
                    maxFactor *= 2; 
                    int[] temp = new int[maxFactor];
					//Storing into temp array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
				//Storing factor
                factors[idx++] = i; 
            }
        }
		//Display the all factor
		System.out.print("Factors of the number " +number + " are ");
		for(int i=0;i<idx;i++){
			System.out.print(factors[i]+" ");
		}
  		
		
	}
}