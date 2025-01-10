import java.util.Scanner;

public class EligibilityforVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object 'sc'
        
        // Input the person's age
        System.out.print("Enter the person's age: ");
        int age = sc.nextInt();
        
        // Check if the person is 18 or older
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
    }
}
