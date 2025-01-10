/*Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint => 
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number
*/
import java.util.Scanner;

public class FrequencyDigitOfNumber{
	public static void main(String[] args){
		//input the number form user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		//Variable frequency created for counting frequency of digit
        int[] frequency = new int[10];	//digit 0-9

        //For each digits calculating frequency
        while (number != 0) {
            int digit = (int) (number % 10); 	// Extract the last digit
            frequency[digit]++;             	// Increment its frequency
            number = number / 10;               // Remove the last digit
        }

        // Frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) { // Display only digits present in the number
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
	}
}