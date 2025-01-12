/*Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint => 
Method to find factors of a number and return them as an array. Note there are 2 for loops one for the count and 
another for finding the factor and storing in the array
Method to find the greates factor of a Number using the factors array
Method to find the sum of the factors using factors array and return the sum
Method to find the product of the factors using factors array and return the product
Method to find product of cube of the factors using the factors array. Use Math.pow() 
Method to Check if a number is a perfect number. Perfect numbers are positive integers that are equal to the
 sum of their proper divisors
Method to find the number is a abundant number.
 A number is called an abundant number if the sum of its proper divisors is greater than the number itself
Method to find the number is a deficient number. 
A number is called a deficient number if the sum of its proper divisors is less than the number itself
Method to Check if a number is a strong number.
 A number is called a strong number if the sum of the factorial of its digits is equal to the number itself
*/
import java.util.Scanner;

public class NumberChecker6 {

    // Method to find the factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        
        // Count the factors of the number
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
            }
        } 
		count++;
        
        // Creating array to store the factors
        int[] factors = new int[count];
        int index = 0;
        
        // Store the factors in the array
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        } 
		factors[index++]=number;
        
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    // Method to find the sum of the factors using the factors array and return the sum
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array and return the product
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
			
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array. Use Math.pow()
    public static int productOfCubeOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
			
            product *= (int)Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
		
        int sum = sumOfFactors(factors)-number; //beacuse we are using proper factor
		
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
		//sum method calling
        int sum = sumOfFactors(factors)-number;
		
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
		//sum method calling
        int sum = sumOfFactors(factors)-number;
		
        return sum < number;
    }
	// Method to calculate the factorial of a number
    public static int factorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Display the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
		
		

        // Display the greatest factor
        System.out.println("Greatest factor of " + number + ": " + greatestFactor(factors));

        // Display the sum of factors
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors(factors));

        // Display the product of factors
        System.out.println("Product of factors of " + number + ": " + productOfFactors(factors));

        // Display the product of the cube of the factors
        System.out.println("Product of the cube of the factors of " + number + ": " + productOfCubeOfFactors(factors));

        // Check if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }



        // Check if the number is an abundant number
        if (isAbundantNumber(number)) {
            System.out.println(number + " is an abundant number.");
        } else {
            System.out.println(number + " is not an abundant number.");
        }

        // Check if the number is a deficient number
        if (isDeficientNumber(number)) {
            System.out.println(number + " is a deficient number.");
        } else {
            System.out.println(number + " is not a deficient number.");
        }



        // Check if the number is a strong number
        if (isStrongNumber(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }
    }
}
