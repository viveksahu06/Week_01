/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/ 
import java.util.Scanner;

public class HeightInFeetAndInch {
    public static void main(String[] args) {
		//Create scanner to take input
        Scanner sc = new Scanner(System.in);
		//Taking height as user input
        System.out.print("Enter your height in centimeters: ");
        int heightInCm = sc.nextInt();
		//calculating cm into  the inches
        double heightInInches = heightInCm / 2.54;
		//calculating cm into  the feet
 
        double heightInFeet =heightInCm / (12*2.54);
       
        //output
        System.out.printf("Your height in cm is %d while in feet is %.2f and inches is %.2f\n",
                heightInCm, heightInFeet, heightInInches);
    }
}
