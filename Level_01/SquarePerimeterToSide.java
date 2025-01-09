/*
Write a program to find the side of the square whose parameter you read from user 
Hint => Perimeter of Square is 4 times side
I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ____
*/ 
import java.util.Scanner; 
public class SquarePerimeterToSide {
    public static void main(String[] args) {
        // Create scanner to take input
        Scanner sc = new Scanner(System.in);
        
        // Take input for perimeter of the square
        System.out.print("Enter the perimeter of the square: "); 
        double perimeter = sc.nextDouble(); 
        
        // Calculate the side of the square
        double side = perimeter / 4.0; 
        
        // Display the data
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
