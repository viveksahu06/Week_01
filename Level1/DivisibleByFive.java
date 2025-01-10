import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is divisible by 5
        if (number % 5 == 0) {
            System.out.println("Is the number " + number + " divisible by 5? Yes");
        } else {
            System.out.println("Is the number " + number + " divisible by 5? No");
        }
        
    
    }
}
