
import java.util.*;
public class CalculatingEmployeeBouns{
    // Method to generate salary and years of service for 10 employees
    public static int[][] generateEmployeeData(int employees) {
        int[][] data = new int[employees][2]; // Salary, Years of Service
        for (int i = 0; i < employees; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000; // Generate 5-digit salary (10000 to 99999)
            data[i][1] = (int) (Math.random() * 10) + 1; // Generate years of service (1 to 10)
        }
        return data;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] results = new double[data.length][2]; // [Bonus, New Salary]
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int yearsOfService = data[i][1];

            double bonus;
            if (yearsOfService > 5) {
                bonus = salary * 0.05; // 5% bonus
            } else {
                bonus = salary * 0.02; // 2% bonus
            }

            double newSalary = salary + bonus;

            results[i][0] = Math.round(bonus * 100.0) / 100.0; // Bonus
            results[i][1] = Math.round(newSalary * 100.0) / 100.0; // New Salary
        }
        return results;
    }

    // Method to calculate totals and display data in tabular format
    public static void displayEmployeeData(int[][] data, double[][] results) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee\tSalary\t\tYears\tBonus\t\tNew Salary");
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus = results[i][0];
            double newSalary = results[i][1];

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.println((i + 1) + "\t" + salary + "\t\t" + years + "\t" + bonus + "\t\t" + newSalary);
        }
    }

    public static void main(String[] args) {
        int employees = 10; // Number of employees

        // Step 1: Generate salary and years of service
        int[][] employeeData = generateEmployeeData(employees);

        // Step 2: Calculate bonus and new salary
        double[][] bonusAndSalary = calculateBonusAndNewSalary(employeeData);

        // Step 3: Display data in a tabular format
        displayEmployeeData(employeeData, bonusAndSalary);
    }
}
