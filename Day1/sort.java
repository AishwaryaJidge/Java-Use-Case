import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        Integer[] numbers = new Integer[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.print("Array in ascending order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.print("Array in descending order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        
        scanner.close();
    }
}
