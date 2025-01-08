import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of positions to rotate: ");
        int n = scanner.nextInt();
        rotateArray(arr, n);
        System.out.println("Array after rotation:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
    public static void rotateArray(int[] arr, int n) {
        int size = arr.length;
        if (size <= 1 || n == 0) {
            return;
        }
        n = n % size;
        reverseArray(arr, 0, size - 1);
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, n, size - 1);
    }
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
