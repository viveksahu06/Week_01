/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array 
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. 
A palindrome number is a number that remains the same when its digits are reversed. 
Method to Check if a number is a duck number using the digits array. 
A duck number is a number that has a non-zero digit present in it
*/ 
import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker4 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static void digitArrayStore(int number, int digitArray[]) {
        int lengthOfNumber = countDigits(number);
		
        for (int i = lengthOfNumber - 1; i >= 0; i--) {
			
            digitArray[i] = number % 10;
            number /= 10;
        }
    }

    // Method to reverse the digits array
    public static void reverseArray(int[] digitArray) {
        int start = 0;
        int end = digitArray.length - 1;
        while (start < end) {
            int temp = digitArray[start];
            digitArray[start] = digitArray[end];
            digitArray[end] = temp;
            start++;
            end--;
        }
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) { 
	    if(array1.length != array2.length) return false; 
		for(int i=0;i<array1.length;i++){
			if(array1[i]!=array2[i]) return false;
		}
        return true; 
		//Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digitArray) {
        for(int i =0;i<digitArray.length/2;i++){
			if(digitArray[i]!=digitArray[digitArray.length-1-i]) 
				return false;
		}
        return true;
    }

    // Method to check if a number is a duck number using the digits array
    // A duck number has a zero in it but cannot start with zero
    public static boolean isDuckNumber(int[] digitArray) {
        for (int i = 1; i < digitArray.length; i++) {
            if (digitArray[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Finding count of digits in the number
        System.out.println("The number " + number + " has " + countDigits(number) + " digits.");

        // Storing the digits of the number in a digits array
        int lengthOfNumber = countDigits(number);
        int[] digitArray = new int[lengthOfNumber];
		
        digitArrayStore(number, digitArray);
        System.out.print("The digits of the number are: ");
        for (int digit : digitArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Reversing the digits array and displaying it
        int[] reversedArray = Arrays.copyOf(digitArray, digitArray.length);
		
		//check for array same or not 
		if(compareArrays(digitArray,reversedArray)) 
		{
			System.out.println("Both array are same");
		}
		else{
			System.out.println("Both array are same");
		}
        reverseArray(reversedArray);
        System.out.print("The reversed digits are: ");
        for (int digit : reversedArray) {
            System.out.print(digit + " ");
        }
        System.out.println(); 
		
 
        // Checking if the number is a palindrome
        if (isPalindrome(digitArray)) {
            System.out.println("The number " + number + " is a palindrome.");
        } else {
            System.out.println("The number " + number + " is not a palindrome.");
        }

        // Checking if the number is a duck number
        if (isDuckNumber(digitArray)) {
            System.out.println("The number " + number + " is a duck number.");
        } else {
            System.out.println("The number " + number + " is not a duck number.");
        }
    }
}
