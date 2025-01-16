import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        System.out.print("Convert to (C/F): ");
        char choice = scanner.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            System.out.println("Temperature in Celsius: " + toCelsius(temp));
        } else if (choice == 'F') {
            System.out.println("Temperature in Fahrenheit: " + toFahrenheit(temp));
        } else {
            System.out.println("Invalid choice.");
        }
    }

    // Function to convert Fahrenheit to Celsius
    private static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    private static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
