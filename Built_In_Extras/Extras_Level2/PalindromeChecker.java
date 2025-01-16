import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = getInput("Enter a string to check if it is a palindrome: ");
        boolean isPalindrome = checkPalindrome(input);
        displayResult(input, isPalindrome);
    }

    // Function to get user input
    private static String getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    // Function to check if a string is a palindrome
    private static boolean checkPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    // Function to display the result
    private static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
