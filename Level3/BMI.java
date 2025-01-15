/*
An organization took up the exercise to find the Body Mass Index (BMI) of all the 
persons in a team of 10 members. For this create a program to find the BMI and 
display the height, weight, BMI, and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) 
for the person and store it in the corresponding 2D array of 10 rows. The First
 Column stores the weight and the second column stores the height in cm
Create a Method to find the BMI and status of every person given the person height 
and weight and return the 2D String array. Use the formula BMI = weight / (height *
 height). Note unit is kg/m^2. For this convert cm to meter
Create a Method that takes the 2D array of height and weight as parameter. Calls 
the  user defined method to compute the BMI and the BMI Status and store in 2D 
String array of height, weight, BMI, and status.
Create a method to display the 2D string array in a tabular format of Person Height
, Weight, BMI and the Status
Finally, the main function takes user inputs, calls the user-defined methods, and
 displays the result.
 
*/
import java.util.Scanner;

public class BMI {

    // Method to compute BMI and status for a person
    public static String[] computeBMI(double weight, double heightInCm) {
        // Convert height from cm to meters
        double heightInMeters = heightInCm / 100;
        // Calculate BMI using the formula
        double bmi = weight / (heightInMeters * heightInMeters);
        // Determine BMI status
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal weight";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        // Return height, weight, BMI, and status as a String array
        return new String[] {
            String.valueOf(weight),
            String.valueOf(heightInCm),
            String.valueOf(bmi),
            status
        };
    }

    // Method to compute BMI and status for all persons
    public static String[][] computeAllBMI(double[][] heightWeightArray) {
        String[][] result = new String[10][4]; // 10 rows for persons, 4 columns for height, weight, BMI, and status
        for (int i = 0; i < heightWeightArray.length; i++) {
            result[i] = computeBMI(heightWeightArray[i][0], heightWeightArray[i][1]);
        }
        return result;
    }

    // Method to display the BMI table
    public static void displayBMI(String[][] bmiData) {
        System.out.println("Person\tWeight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                bmiData[i][0] + "\t\t" +
                bmiData[i][1] + "\t\t" +
                bmiData[i][2] + "\t\t" +
                bmiData[i][3]
            );
        }
    }

    // Main method to take input and call other methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeightArray = new double[10][2]; // Array to store height and weight for 10 persons

        System.out.println("Enter the weight (in kg) and height (in cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            heightWeightArray[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            heightWeightArray[i][1] = scanner.nextDouble();
        }

        // Compute BMI for all persons
        String[][] bmiData = computeAllBMI(heightWeightArray);

        // Display the BMI table
        System.out.println("\nBMI Report:");
        displayBMI(bmiData);
    }
}
