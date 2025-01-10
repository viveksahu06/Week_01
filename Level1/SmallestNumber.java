import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the three numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();
        
        // Check if the first number is the smallest
        if (number1 <= number2 && number1 <= number3) {
            System.out.println("Is the first number the smallest? Yes");
        } else {
            System.out.println("Is the first number the smallest? No");
        }
        
        scanner.close();
    }
}
