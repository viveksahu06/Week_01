import java.util.*;

public class CalculatingGradeOfStudent {

    // Method to generate random scores for students
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; // 3 subjects: Physics, Chemistry, Math
        for (int i = 0; i < students; i++) {
            scores[i][0] = (int) (Math.random() * 100) + 1; // Physics score
            scores[i][1] = (int) (Math.random() * 100) + 1; // Chemistry score
            scores[i][2] = (int) (Math.random() * 100) + 1; // Math score
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateMarks(int scores[][]) {
        double[][] results = new double[scores.length][3]; // 3 metrics: total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Total score
            double average = total / 3.0; // Average score
            double percentage = (total / 300.0) * 100; // Percentage score

            results[i][0] = total; // Store total
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round and store average
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round and store percentage
        }

        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + "\t\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.print(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "%");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Taking input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of students: ");
        int students = input.nextInt();

        // Generate random scores
        int[][] scores = generateScores(students);

        // Calculate total, average, and percentage
        double[][] results = calculateMarks(scores);

        // Display the scorecard
        displayScorecard(scores, results);

        input.close();
    }
}
