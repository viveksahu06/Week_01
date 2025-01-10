/*
Create a program to find the BMI of a person
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and store it in the corresponding variable.
Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Use the table to determine the weight status of the person

 */
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Take weight input in kilograms
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        // Take height input in centimeters
        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

        // Convert height from centimeters to meters
        double heightM = heightCm / 100;

        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);

        // Output the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine the weight status based on BMI
        if (bmi <= 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Weight Status: Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}
