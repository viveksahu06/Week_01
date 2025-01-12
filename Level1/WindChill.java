/*Write a program calculate the wind chill temperature given the temperature and wind speed
Hint => 
Write a method to calculate the wind chill temperature using the formula 
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
public double calculateWindChill(double temperature, double windSpeed)
*/


import java.util.Scanner;

public class WindChill{
	public double calculateWindChill(double temperature, double windSpeed){
		double windChill = 35.74 + 0.6215 * temperature + ( 0.4275 * temperature - 35.75 ) * Math.pow( windSpeed , 0.16 );
		return windChill;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//taking temperature, wind speed as input from user
		System.out.print("Enter temperature : ");
		double temperature = input.nextDouble();
		
		System.out.print("Enter wind speed : ");
		double windSpeed = input.nextDouble();
		
		//creating object wc of windChill class
		WindChill wc = new WindChill();
		//output
		System.out.println("Wind chill is : " + wc.calculateWindChill( temperature, windSpeed ));
	}

}