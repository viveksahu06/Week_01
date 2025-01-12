import java.util.*;

public class MatrixOperations {
    // Method to create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); // Random values from 0 to 9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix1) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix1[i][j];
            }
        }
        return transpose;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix1) {
        return matrix1[0][0] * matrix1[1][1] - matrix1[0][1] * matrix1[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix1) {
        return matrix1[0][0] * (matrix1[1][1] * matrix1[2][2] - matrix1[1][2] * matrix1[2][1])
             - matrix1[0][1] * (matrix1[1][0] * matrix1[2][2] - matrix1[1][2] * matrix1[2][0])
             + matrix1[0][2] * (matrix1[1][0] * matrix1[2][1] - matrix1[1][1] * matrix1[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix1) {
        int determinant = determinant2x2(matrix1);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix1[1][1] / (double) determinant;
        inverse[0][1] = -matrix1[0][1] / (double) determinant;
        inverse[1][0] = -matrix1[1][0] / (double) determinant;
        inverse[1][1] = matrix1[0][0] / (double) determinant;

        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix1) {
        int determinant = determinant3x3(matrix1);
        if (determinant == 0) {
            throw new ArithmeticException("Matrix is singular and cannot be inverted.");
        }

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int[][] minor = new int[2][2];
                int minorRow = 0, minorCol = 0;
                for (int row = 0; row < 3; row++) {
                    if (row == i) continue;
                    minorCol = 0;
                    for (int col = 0; col < 3; col++) {
                        if (col == j) continue;
                        minor[minorRow][minorCol] = matrix1[row][col];
                        minorCol++;
                    }
                    minorRow++;
                }
                inverse[j][i] = Math.pow(-1, i + j) * determinant2x2(minor) / (double) determinant;
            }
        }
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix1) {
        for (int[] row : matrix1) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix1) {
        for (double[] row : matrix1) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 3, cols = 3;

        // Creating random matrices
        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Addition
        System.out.println("Addition of Matrices:");
        displayMatrix(addMatrices(matrix1, matrix2));

        // Subtraction
        System.out.println("Subtraction of Matrices:");
        displayMatrix(subtractMatrices(matrix1, matrix2));

        // Multiplication
        System.out.println("Multiplication of Matrices:");
        displayMatrix(multiplyMatrices(matrix1, matrix2));

        // Transpose
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        // Determinant of 3x3 Matrix
        System.out.println("Determinant of Matrix 1:");
        System.out.println(determinant3x3(matrix1));

        // Inverse of 3x3 Matrix
        System.out.println("Inverse of Matrix 1:");
        try {
            displayMatrix(inverse3x3(matrix1));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
