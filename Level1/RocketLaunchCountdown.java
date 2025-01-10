import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object 'sc'
        
        // Input the countdown starting value
        System.out.print("Enter the countdown starting value: ");
        int counter = sc.nextInt();
        
        // Start countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;  // Decrement the counter
        }
        
        // Print final message
        System.out.println("Launch!");
        
    }
}
