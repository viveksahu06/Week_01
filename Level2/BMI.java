/*
An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status. 
*/
import java.util.Scanner;

public class BMI {
    public static double calculateBMI(double weight, double height) {
        // Converting height from cm to meters
        height = height / 100;
		
        // Calculating BMI
        return weight / (height * height);
    }

    public static String determineStatus(double bmi) {
		//determining status
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initializing a 2D array to store weight, height, and BMI
        double[][] data = new double[10][3];

        // taking input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the weight of person " + (i + 1) + " in kg: ");
            data[i][0] = input.nextDouble();
            System.out.print("Enter the height of person " + (i + 1) + " in cm: ");
            data[i][1] = input.nextDouble();
            // Calculate BMI and store it in the array
            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        // Displaying the details of each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Person Number: " + (i + 1));
            System.out.println("Weight: " + data[i][0] + " kg");
            System.out.println("Height: " + data[i][1] + " cm");
            System.out.println("BMI: " + data[i][2]);
            System.out.println("Weight Status: " + determineStatus(data[i][2]));
            System.out.println();
        }
    }
}


