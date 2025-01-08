import java.util.Scanner;

public class FindLargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        scanner.close();
    }
}
