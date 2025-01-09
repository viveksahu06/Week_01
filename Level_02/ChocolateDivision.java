import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking number of chocolates 
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
		//Taking number of children as input

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Calculating chocolates each child gets and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Displaying the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + 
                           " and the number of remaining chocolates are " + remainingChocolates + ".");

    }
}
