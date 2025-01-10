import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }

        // Calculate sum using formula
        int formulaSum = n * (n + 1) / 2;

        // Calculate sum using while loop
        int loopSum = 0;
        int i = 1;
        while (i <= n) {
            loopSum += i;
            i++;
        }

        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Sum using while loop: " + loopSum);

        if (formulaSum == loopSum) {
            System.out.println("Both results are correct.");
        } else {
            System.out.println("There is a discrepancy.");
        }

    }
}
