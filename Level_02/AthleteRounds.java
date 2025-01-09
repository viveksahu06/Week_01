import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the sides of the triangle
        System.out.print("Enter the length of side1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculating the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Total distance the athlete wants to run (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculating the number of rounds the athlete must complete
        double rounds = totalDistance / perimeter;

        // Printing the result
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km.");
    }
}
