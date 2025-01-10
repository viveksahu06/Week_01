/*Write a program FizzBuzz, take a number as user input and if it is a positive 
integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the 
number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array 
results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
Hint => 
Create a String Array to save the results and 
Finally, loop again to show the results of the array based on the index position

*/
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner  sc = new Scanner(System.in);

        // Take the number input from the user
        System.out.print("Enter a positive integer: ");
        int number =  sc.nextInt();
		//Array to storing results
		String []results=new String[number+1]; 
		
		int idx=0;
        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer."); 
			System.exit(0);
        } 
            // Loop from 1 to the number
            for (int i = 0; i <= number; i++) {
                // Check if the number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0 ) {
                    results[idx++]="FizzBuzz";
                }
                // Check if the number is divisible by 3
                else if (i % 3 == 0) {
                   results[idx++]="Fizz";
                }
                // Check if the number is divisible by 5
                else if (i % 5 == 0) {
                    results[idx++]="Buzz";
                }
                // Otherwise, print the number itself
                else {
                    results[idx++]=Integer.toString(i);
                }
            }
        //Display the result
		for(int i=0;i<idx;i++){
			System.out.print("Position " + i + " = " + results[i] + " , ");
		}
    }
}
