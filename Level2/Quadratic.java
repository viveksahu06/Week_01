/*
Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + delta)/(2*a) 
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
*/

//importing scanner class
import java.util.Scanner;

public class Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If delta is positive, calculate two roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }

        // If delta is zero, calculate the single root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }

        // If delta is negative, return an empty array
        else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking coefficients a, b, and c as input
        System.out.print("Enter the coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = input.nextDouble();

        // Validate 'a' to ensure it's not zero
        if (a == 0) {
            System.out.println("Invalid input. Coefficient 'a' cannot be zero for a quadratic equation.");
            return;
        }

        // Call the method to find roots
        double[] roots = findRoots(a, b, c);

        // Display the roots based on the size of the array
        if (roots.length == 2) {
            System.out.printf("The equation has two roots: Root1 = %.2f, Root2 = %.2f\n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("The equation has one root: Root = %.2f\n", roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }

        // Closing the Scanner
        input.close();
    }
}
