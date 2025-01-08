import java.util.Arrays;
import java.util.Scanner;

public class MergeAndSortArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
        int[] mergedArray = mergeAndSortArrays(array1, array2);
        System.out.println("Merged and Sorted Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
    public static int[] mergeAndSortArrays(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;
        int[] mergedArray = new int[size1 + size2];

        System.arraycopy(array1, 0, mergedArray, 0, size1);
        System.arraycopy(array2, 0, mergedArray, size1, size2);
        Arrays.sort(mergedArray);

        return mergedArray;
    }
}
