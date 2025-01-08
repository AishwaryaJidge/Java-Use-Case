import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        removeDuplicates(arr);

        scanner.close();
    }
    public static void removeDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }
        System.out.println("Unique elements in the array:");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }
    }
}
