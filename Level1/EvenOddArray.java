/*Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. 
Finally, print the odd and even numbers array
Hint => 
Get an integer input from the user, assign it to a variable number, and check for Natural Number.
 If not a natural number then print an error and exit the program
Create an integer array for even and odd numbers with size = number / 2 + 1
Create index variables for odd and even numbers and initialize them to zero
Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the 
corresponding array
Finally, print the odd and even numbers array using the odd and even index
*/
import java.util.Scanner; 
public class EvenOddArray{
	public static void main(String []args){
		//Creating Scanner class 
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter the number till you want even or odd number: "); 
		
		//Taking input from user  
		int number=sc.nextInt(); 
		
		if(number<=0){ 
			System.err.println("Enter any natural number"); 
			System.exit(0);
		}
		
		int size = number / 2 + 1;

        int[] evenNumbers = new int[size];
        int[] oddNumbers = new int[size];

        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            } else {
                oddNumbers[oddIndex++] = i;
            }
        } 
		
		//print odd number
		System.out.print("Odd numbers are till "+ number +" is " );
		
		for(int i=0;i<oddIndex;i++){
			System.out.print(oddNumbers[i]+" ");
		}
		
		System.out.println();
		
		//printing even number
		
		System.out.print("Odd numbers are till "+ number +" is " );
		for(int i=0;i<evenIndex;i++){
			System.out.print(evenNumbers[i]+" ");
		}
		
	}
}