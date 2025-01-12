/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  
Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 
*/


import java.util.Scanner;

public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius and return the value
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit and return the value
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms and return the value
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds and return the value
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters and return the value
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons and return the value
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking user input for conversion
        System.out.print("Enter the value for conversion: ");
        double value = input.nextDouble();

        // Fahrenheit and Celsius conversions
        System.out.println("Fahrenheit to Celsius: " + convertFahrenheitToCelsius(value));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(value));

        // Pounds and Kilograms conversions
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(value));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(value));

        // Gallons and Liters conversions
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(value));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(value));

        // Close the scanner
        input.close();
    }
}
