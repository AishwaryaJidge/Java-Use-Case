import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];
        System.out.println("Enter elements of the first matrix:");
        inputMatrix(matrix1, rows, cols, scanner);
        System.out.println("Enter elements of the second matrix:");
        inputMatrix(matrix2, rows, cols, scanner);
        addMatrices(matrix1, matrix2, result, rows, cols);
        System.out.println("Resultant Matrix after addition:");
        displayMatrix(result, rows, cols);
        
        scanner.close();
    }
    public static void inputMatrix(int[][] matrix, int rows, int cols, Scanner scanner) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    public static void addMatrices(int[][] matrix1, int[][] matrix2, int[][] result, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }
    public static void displayMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
