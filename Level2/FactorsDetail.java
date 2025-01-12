/*Create a program to find the factors of a number taken as user input, store the factors in an array and display the factors. 
Also find the sum, sum of square of factors and product of the factors and display the results
Hint => 
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array. 
To find factors and save to array will have two loops. 
The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method
 */
 //impoting Scanner class
 import java.util.Scanner;
 public class FactorsDetail{
	 
	 // Defining the method to find the factors of a given number 
	public static int[] findingFactor(int number){
		int countFactores =0;
		for(int i=1;i<=number;i++){
			if(number%i==0){
				countFactores++;
			}
		}
		int factorArr [] =new int[countFactores];
		int j=0;
		for(int i=1;i<=number;i++){
			if(number %i==0){
				factorArr[j]=i;
				j++;
			}
			
		}
		return factorArr;
	} 
	
	// Defining the method to find the sum of given factor array
	public static int findingFactorSum(int[] factorArr){
		int factorSum= 0;
		
		for(int i=0;i<factorArr.length;i++){
			
			factorSum +=factorArr[i];
		}
		return factorSum;
	}
	
	// Defining the method to find the Square sum of given factor array
	public static int findingFactorSquareSum(int[] factorArr){
		int factorSqSum= 0;
		
		for(int i=0;i<factorArr.length;i++){
			
			factorSqSum +=(int)Math.pow(factorArr[i],2);
		}
		return factorSqSum;
	}
	
	// Defining the method to find the multilication of given factor array
	public static int findingFactorMul(int[] factorArr){
		int factorMulti= 1;
		
		for(int i=0;i<factorArr.length;i++){
			
			factorMulti *=factorArr[i];
		}
		return factorMulti ;
	}
	 
	 
    public static void main(String []args){
		//creating object of scanner class for taking input
        Scanner input = new Scanner(System.in); 
        
		System.out.println("Enter the number : ");
        int number = input.nextInt();
		// initializing the array to to store the factors of given number
        int factorArr[]=FactorsDetail.findingFactor(number);
       
        // storing the sum of factor array 
        int factorSum = FactorsDetail.findingFactorSum(factorArr);
		// storing the Square sum of factor array 
        int factorSquareSum = FactorsDetail.findingFactorSquareSum(factorArr);
		// storing the multiplication of factor array 
        int factorMultiply = FactorsDetail.findingFactorMul(factorArr);		
		
		// printing the result of factor sum
		System.out.print("The Sum of Factor of given number " +number+ " is ");
		System.out.println(factorSum);
		// printing the result of factor Square sum
		System.out.print("The Square Sum of Factor of given number " +number+ " is ");
		System.out.println(factorSquareSum);
		// printing the result of factor multiplicatiion
		System.out.print("The multiply of Factor of given number " +number+ " is ");
		System.out.println(factorMultiply);
    }
 }