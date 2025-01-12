/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  
Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertYardsToFeet(double yards) => 
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;*/

import java.util.Scanner;

public class UnitConverter2 {

    // Method to convert yards to feet and return the value
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards and return the value
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches and return the value
    public static double convertMeterToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters and return the value
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters and return the value
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input for distance
        System.out.print("Enter the distance: ");
        double distance = input.nextDouble();

        // Calling and displaying each result
      
        System.out.println("Yards to Feet: " + convertYardsToFeet(distance));
        System.out.println("Feet to Yards: " + convertFeetToYards(distance));
        System.out.println("Meters to Inches: " + convertMeterToInches(distance));
        System.out.println("Inches to Meters: " + convertInchesToMeters(distance));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(distance));

        // Closing the Scanner object
        input.close();
    }
}
