import java.util.Scanner;

public class ProductStockChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {"Product A", "Product B", "Product C", "Product D", "Product E"};
        int[] stockLevels = {50, 10, 5, 30, 2};
        int reorderThreshold = 10;

        System.out.println("Warehouse Stock Checker\n");

        while (true) {
            System.out.println("Product Stock Levels:");
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i] + " - Stock: " + stockLevels[i]);
            }

            System.out.println("\nChecking stock...");
            boolean reorderNeeded = false;

            for (int i = 0; i < products.length; i++) {
                if (stockLevels[i] < reorderThreshold) {
                    System.out.println("Reorder needed for " + products[i] + " (Stock: " + stockLevels[i] + ")");
                    reorderNeeded = true;
                }
            }

            if (!reorderNeeded) {
                System.out.println("All products have sufficient stock.");
            }

            System.out.print("\nDo you want to update stock levels and check again? (yes/no): ");
            String continueChecking = scanner.nextLine();

            if (!continueChecking.equalsIgnoreCase("yes")) {
                break;
            }
            for (int i = 0; i < products.length; i++) {
                System.out.print("Enter new stock level for " + products[i] + ": ");
                stockLevels[i] = scanner.nextInt();
            }
            scanner.nextLine();
        }

        System.out.println("Thank you for using the Warehouse Stock Checker!");
        scanner.close();
    }
}
