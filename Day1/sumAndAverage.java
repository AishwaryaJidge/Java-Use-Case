import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array: ");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / n;
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);
        scanner.close();
    }
}
