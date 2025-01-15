
/*
 * Write a program to take user input for the age of all 10 students in a class
 * and check whether the student can vote depending on his/her age is greater or
 * equal to 18.
 * Hint =>
 * Create a method to define the random 2 digit age of number of students
 * provided as method parameters and return 1D array of age of n students
 * Create a method which takes in array of age as a parameter and returns 2D
 * String array of age and boolean true or false to indicate can vote and cannot
 * vote. Inside the method firstly validate the age for a negative number, if a
 * negative cannot vote. For valid age check for age is 18 or above to settrue
 * to indicate can vote.
 * Create a method to display the 2D array in a tabular format.
 * Finally, the main function takes user inputs, calls the user-defined methods,
 * and displays the result.
 */
import java.util.Random;
import java.util.Scanner;

public class StudentVoting {

  // Method to generate random ages for 'n' students
  public static int[] generateRandomAges(int n) {
    Random rand = new Random();
    int[] ages = new int[n];

    // Generating random 2-digit ages (between 10 and 99)
    for (int i = 0; i < n; i++) {
      ages[i] = rand.nextInt(90) + 10; // Random age between 10 and 99
    }
    return ages;
  }

  // Method to check voting eligibility
  public static String[][] checkVotingEligibility(int[] ages) {
    String[][] eligibility = new String[ages.length][2];

    // Checking voting eligibility for each student
    for (int i = 0; i < ages.length; i++) {
      eligibility[i][0] = String.valueOf(ages[i]); // Store age as a string
      if (ages[i] < 0) {
        eligibility[i][1] = "Cannot Vote";
      } else if (ages[i] >= 18) {
        eligibility[i][1] = "Can Vote";
      } else {
        eligibility[i][1] = "Cannot Vote";
      }
    }
    return eligibility;
  }

  // Method to display the 2D array in tabular format
  public static void displayTable(String[][] eligibility) {
    System.out.println("Age - Voting Eligibility");
    System.out.println("------------------------");

    // Printing each row
    for (int i = 0; i < eligibility.length; i++) {
      System.out.println(eligibility[i][0] + " - " + eligibility[i][1]);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Taking input for number of students (10 in this case)
    System.out.println("Enter the number of students : ");
    int numStudents = scanner.nextInt();

    // Generating random ages for the students
    int[] ages = generateRandomAges(numStudents);

    // Checking voting eligibility based on ages
    String[][] eligibility = checkVotingEligibility(ages);

    // Displaying the result in tabular format
    displayTable(eligibility);


  }
}
