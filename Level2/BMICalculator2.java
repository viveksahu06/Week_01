/*
Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
*/
import java.util.Scanner;

public class BMICalculator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of persons form user
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[number][3]; // [][0]: Weight, [][1]: Height, [][2]: BMI
        String[] weightStatus = new String[number];

        // Taking input for height and weight form user
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter data for person " + (i + 1) + ":");

            // Weight
            while (true) {
                System.out.print("Weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] > 0) break;
                System.out.println("Invalid input. Weight must be positive.");
            }

            // Height
            while (true) {
                System.out.print("Height (m): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0) break;
                System.out.println("Invalid input. Height must be positive.");
            }
        }

        // Calculating BMI and weight status
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            // Calculating BMI
            personData[i][2] = weight / (height * height);

            // Determining Weight Status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the results
        System.out.println("\nResults:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height (m)", "Weight (kg)", "BMI", "Weight Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
