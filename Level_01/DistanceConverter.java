/*Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/
import java.util.Scanner;
public class DistanceConverter {
    public static void main(String[] args) {
        // Create scanner to take input
        Scanner sc = new Scanner(System.in);
        
        // Taking input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        
        // Calculate distance in yards
        double distanceInYards = distanceInFeet / 3.0; 
        
        // Calculate distance in miles
        double distanceInMiles = distanceInYards / 1760.0; 

        // Display the data
        System.out.println("The distance in feet is: " + distanceInFeet+" The distance in yards is: " + distanceInYards+" The distance in miles is: " + distanceInMiles);
    }
}
