/*
Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint => 
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)
*/
import java.util.Scanner;

public class Trigonometry {
    public double[] calculateTrigonometricFunctions(double angle) {
        // Converting angle to radians
        double radians = Math.toRadians(angle);

        // Calculating trigonometric functions
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Returning the results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking angle as input from user
        System.out.print("Enter angle: ");
        double angle = input.nextDouble();

        // Creating an object of Trigonometry class
        Trigonometry trig = new Trigonometry();

        // Calculating trigonometric functions
        double[] results = trig.calculateTrigonometricFunctions(angle);

        // Displaying the results
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
    }
}
