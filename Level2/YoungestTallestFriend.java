/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint => 
Take user input for the age and height of the 3 friends and store it in a variable
Find the smallest of the 3 ages to find the youngest friend and display it
Find the largest of the 3 heights to find the tallest friend and display it
 */
import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Declare variables for age and height of the friends
        int ageAmar, ageAkbar, ageAnthony;
        double heightAmar, heightAkbar, heightAnthony;

        // Input ages of the three friends
        System.out.print("Enter the age of Amar: ");
        ageAmar = sc.nextInt();

        System.out.print("Enter the age of Akbar: ");
        ageAkbar = sc.nextInt();

        System.out.print("Enter the age of Anthony: ");
        ageAnthony = sc.nextInt();

        // Input heights of the three friends
        System.out.print("Enter the height of Amar (in meters): ");
        heightAmar = sc.nextDouble();

        System.out.print("Enter the height of Akbar (in meters): ");
        heightAkbar = sc.nextDouble();

        System.out.print("Enter the height of Anthony (in meters): ");
        heightAnthony = sc.nextDouble();

        // Find the youngest friend based on age (smallest age)
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }

        // Find the tallest friend based on height (largest height)
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        // Output the results
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " meters");
    }
}
