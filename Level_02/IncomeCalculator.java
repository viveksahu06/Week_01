import java.util.Scanner;

public class IncomeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking salary as input
        System.out.print("Enter your salary in INR: ");
        double salary = sc.nextDouble();

        // Taking bonus as input
        System.out.print("Enter your bonus in INR: ");
        double bonus = sc.nextDouble();

        // Calculating total income
        double totalIncome = salary + bonus;

        // Printing the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus +
                           ". Hence Total Income is INR " + totalIncome + ".");
    }
}
