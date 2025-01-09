import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking weight in pounds as input
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = sc.nextDouble();

        // Converting pounds to kilograms
        double weightInKg = weightInPounds * 2.2;

        // Displaying the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg + ".");

    }
}
