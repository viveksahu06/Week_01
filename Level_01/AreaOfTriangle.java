/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/
import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        // Create scanner to take input
        Scanner sc = new Scanner(System.in);
        
        // Taking input for base of the triangle
        System.out.print("Enter the base of triangle in cm ");
        int base = sc.nextInt(); 
        
        // Taking input for height of the triangle
        System.out.print("Enter the height of triangle in cm ");
        int height = sc.nextInt(); 
        
        // Calculate the area of the triangle in square centimeters
        float areaOfTriangle = 0.5f * base * height;
        
        // Converting the area from square centimeters to square inches
        float areaInSqInches = areaOfTriangle / (2.54f * 2.54f);
        
        // Display the area in both square centimeters and square inches
        System.out.println("Area of the Triangle is in square centimeters is " + areaOfTriangle + " and in square inches is " + areaInSqInches);
    } 
}
