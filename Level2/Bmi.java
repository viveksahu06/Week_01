/*An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team.
 For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person
 */
 import java.util.Scanner;

public class Bmi {
    public static void main(String args[]) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input the number of persons
        System.out.print("Enter the number of persons: ");
        int noOfPerson = sc.nextInt();

        // Initializing an array to store the weight of each person
        double weight[] = new double[noOfPerson];

        // Initializing an array to store the height of each person
        double height[] = new double[noOfPerson];

         // taking Input  from the user for  height of each person
        for (int i = 0; i < noOfPerson; i++) {
            System.out.print("Enter the height of person " + (i + 1) + " in meters: ");
            height[i] = sc.nextDouble();
            System.out.println();
        }

        // taking Input  from the user for  weight of each person
        for (int i = 0; i < noOfPerson; i++) {
            System.out.print("Enter the weight of person " + (i + 1) + " in kilograms: ");
            weight[i] = sc.nextDouble();
            System.out.println();
        }

        // Initializing an array to calculate and store the BMI of each person
        double bmi[] = new double[noOfPerson];

        // Calculate BMI for each person
        for (int i = 0; i < noOfPerson; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
        }

        // Initializing an array to store the weight status of each person
        String[] statuses = new String[noOfPerson];

        // Determining the weight status based on the BMI
        for (int i = 0; i < noOfPerson; i++) {
            if (bmi[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Printing the details of each person: weight, height, BMI, and weight status
        for (int i = 0; i < noOfPerson; i++) {
            System.out.println("Person Number: " + (i + 1));
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " m");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Weight Status: " + statuses[i]);
            System.out.println();
        }
    }
}
