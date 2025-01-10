import java.util.Scanner;

public class RocketLaunchCountdownUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object 'sc'
        
        // Input the countdown starting value
        System.out.print("Enter the countdown starting value: ");
        int counter = sc.nextInt();
        
        // Use a for loop to count down from the starting value to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        
        // Print final message
        System.out.println("Launch!");
        
    }
}
