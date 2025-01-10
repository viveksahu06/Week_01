import java.util.Scanner;

public class SumUntilZeroPress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;

        // Take user input and add to total until 0 is entered
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextDouble();

            if (num == 0) {
                break;
            }

            total += num;  // Add user entered value to total
        }
        System.out.println("The total sum is: " + total);
    }
}
