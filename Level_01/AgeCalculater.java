/*Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024
I/P => NONE
O/P => Harry's age in 2024 is ___*/ 
public class AgeCalculater {
    public static void main(String[] args) {
        // Define the name
        String name = "Harry";
        // Define the birth year
        int birthYear = 2020;  
        // Define the current year
        int currentYear = 2024; 

        // Calculate the present age
        int presentAge = currentYear - birthYear; 
        
        // Display the result
        System.out.println("Harry's age in 2024 is " + presentAge);
    }
}
