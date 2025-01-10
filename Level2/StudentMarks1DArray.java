/*Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines 

Hint => 
Take input for the number of students
Create arrays to store marks, percentages, and grades of the students
Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
Calculate the percentage and grade of the students based on the percentage
Display the marks, percentages, and grades of each student

*/
import java.util.Scanner;

public class StudentMarks1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the number of students from user
        System.out.print("Enter the number of students: ");
        int noOfStudents = sc.nextInt();

        // Creating Arrays to store marks, percentages, and grades
        int[] marksP = new int[noOfStudents];
        int[] marksC = new int[noOfStudents];
        int[] marksM = new int[noOfStudents];
        int[] percentage = new int[noOfStudents];
        char[] grade = new char[noOfStudents];

        // Taking input for marks
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            // for Physics
            while (true) {
                System.out.print("Physics: ");
                marksP[i] = sc.nextInt();
                if (marksP[i] >= 0) break;
                System.out.println("Invalid input. Marks must be positive.");
            }

            // for Chemistry
            while (true) {
                System.out.print("Chemistry: ");
                marksC[i] = sc.nextInt();
                if (marksC[i] >= 0) break;
                System.out.println("Invalid input. Marks must be positive.");
            }

            // for Mathematics
            while (true) {
                System.out.print("Mathematics: ");
                marksM[i] = sc.nextInt();
                if (marksM[i] >= 0) break;
                System.out.println("Invalid input. Marks must be positive.");
            }
        }

        // Calculating percentage and grade
        for (int i = 0; i < noOfStudents; i++) {
            int totalMarks = marksP[i] + marksC[i] + marksM[i];
            percentage[i] = (totalMarks * 100) / 300;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R'; // Remedial remark
            }
        }

        // Displaying results of each student
        System.out.println("\nResults:");
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Marks - Physics: " + marksP[i] + ", Chemistry: " + marksC[i] + ", Mathematics: " + marksM[i]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
        }
    }
}
