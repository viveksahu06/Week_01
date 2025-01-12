/*Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  
Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertKmToMiles(double km) => 
Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;
*/
import java.util.Scanner;
public class UnitConverter {

    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double number) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = number * km2miles;

         // returning the value
        return miles;
    }
	//Method To convert miles to kilometers and return the value
	public static double convertMilesToKm(double number) {
        // Convert miles to km  
        double miles2km = 1.60934;
        double kilometers = number * miles2km;

        // returning the value
        return kilometers;
    }
	
	//Method To convert meters to feet and return the value
	public static double convertMeterToFeet(double number) {
        // convert meters to feet
       double meters2feet = 3.28084;
        double feet = number * meters2feet;

       // returning the value
        return feet;
    }
	//Method To convert feet to meter and return the value
	public static double convertFeetToMeter(double number) {
        // convert feet to meter 
       double feet2meters = 0.3048;
        double meter = number * feet2meters;

        // returning the value
        return meter;
    }

    public static void main(String[] args) {
        // Creating a Scanner object
        Scanner input = new Scanner(System.in);

        // Taking input for km
        System.out.print("Enter the distance : ");
        double number = input.nextDouble();

        // Calling the method to convert km to miles
        double miles = UnitConverter.convertKmToMiles(number); 

        // Displaying value in miles
        System.out.println("Distance in kilometer to miles: " + miles);
		
		
        // Calling the method to convert miles to kilometer
        double kilometer = UnitConverter.convertMilesToKm(number); 

        // Displaying value in kilometer
        System.out.println("Distance in miles to kilometer: " + kilometer);
		
		// Calling the method to convert meter to feet
        double feet = UnitConverter.convertMeterToFeet(number); 

        // Displaying value in feet
        System.out.println("Distance in meter to feet: " + feet);
		
		// Calling the method to convert feet to meter
        double meter = UnitConverter.convertFeetToMeter(number); 

        // Displaying value in meter
        System.out.println("Distance in feet to meter: " + meter);

        // Closing the Scanner object
        input.close();
    }
}
