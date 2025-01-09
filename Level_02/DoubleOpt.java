import java.util.Scanner;
public class DoubleOpt{
	public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        // Taking first variable as input from the user
        System.out.print("Enter first input a: ");
        double a = sc.nextDouble();

        // Taking second variable input
        System.out.print("Enter second input b: ");
        double b = sc.nextDouble();

        // Taking third variable input
        System.out.print("Enter third input c: ");
        double c = sc.nextDouble();

        // Calculating a + b * c
        double result1 = a + b * c;

        // Calculating a * b + c
        double result2 = a * b + c;

        // Calculating c + a / b
        double result3 = c + a / b;

        // Calculating a % b + c
        double result4 = a % b + c;
		
		//output 
		System.out.println("Results: a + b * c = " + result1 + ", a * b + c = " + result2 + 
                           ", c + a / b = " + result3 + ", a % b + c = " + result4);

		
		
	}
}