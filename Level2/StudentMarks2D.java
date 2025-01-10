/*Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint => 
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students
*/
import java.util.Scanner;

public class StudentMarks2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the number of students
        System.out.print("Enter the number of students: ");
        int noOfStudents = sc.nextInt();

        // Creating 2D array to store marks for Physics, Chemistry, and Maths
        int[][] marks = new int[noOfStudents][3]; // Rows: students, Columns: subjects
        int[] percentage = new int[noOfStudents];
        char[] grade = new char[noOfStudents];

        // Taking input for marks
        for (int i = 0; i < noOfStudents; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            // for Physics
            while (true) {
                System.out.print("Physics: ");
                marks[i][0] = sc.nextInt();
                if (marks[i][0] >= 0) break;
                System.out.println("Invalid input. Marks must be positive.");
            }

            // for Chemistry
            while (true) {
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextInt();
                if (marks[i][1] >= 0) break;
                System.out.println("Invalid input. Marks must be positive.");
            }

            // for Mathematics
            while (true) {
                System.out.print("Mathematics: ");
                marks[i][2] = sc.nextInt();
                if (marks[i][2] >= 0) break;
                System.out.println("Invalid input. Marks must be positive.");
            }
        }

        // Calculating percentage and grade of student
        for (int i = 0; i < noOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
            System.out.println("Marks - Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Mathematics: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i] + "%");
            System.out.println("Grade: " + grade[i]);
        }
    }
}
