import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object 'sc'
        
        // Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        
    }
}
