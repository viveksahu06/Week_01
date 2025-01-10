/*Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 

Hint => 
Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks
 */
import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Taking input for marks in three subjects
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();

        // Calculating the total marks and percentage
        double totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 300) * 100;  // Assuming maximum marks for each subject is 100

        // Determining the grade based on percentage
        String grade = "";
        String remarks = "";

        // Grade and Remarks logic as per the updated system
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Displaying the results
        System.out.println("\n---- Student Report ----");
        System.out.println("Total Marks: " + totalMarks + " out of 300");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
