import java.util.Scanner;

public class TemperatureConversionFtoCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking temperature in Fahrenheit as input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Converting Fahrenheit to Celsius using the formula
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Printing the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

    }
}
