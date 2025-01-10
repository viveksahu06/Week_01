import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        double num;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            total += num;  // Add user entered value to total
        }

        System.out.println("The total sum is: " + total);
     
    }
}
