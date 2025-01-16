import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        int number = getInput("Enter a number to check if it is prime: ");
        
        // Check if the number is prime
        boolean isPrime = checkPrime(number);

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to take input from the user
    private static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to check if a number is prime
    private static boolean checkPrime(int number) {
        if (number <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // Divisible by other numbers
        }
        return true; // Prime if no divisors found
    }
}
