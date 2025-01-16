import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100. The computer will try to guess it!");

        // Loop until the correct number is guessed
        while (!found) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.print("Is it 'high', 'low', or 'correct'? ");
            String feedback = scanner.nextLine().toLowerCase();

            // Process user feedback and adjust the range
            if (feedback.equals("correct")) {
                System.out.println("Hooray! The computer guessed your number.");
                found = true;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
    }

    // Function to generate a guess within the current range
    private static int generateGuess(int low, int high) {
        return low + (high - low) / 2; // Binary search approach for guessing
    }
}
