import java.util.Scanner;

public class ProductDiscountFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        for (int i = 1; i <= numProducts; i++) {
            System.out.println("\nProduct " + i + ":");
            System.out.print("Enter the original price: $");
            double price = scanner.nextDouble();

            System.out.print("Enter the discount percentage: ");
            double discountPercentage = scanner.nextDouble();
            double discountAmount = (discountPercentage / 100) * price;
            double discountedPrice = price - discountAmount;
            System.out.printf("Discounted price: $%.2f\n", discountedPrice);
        }

        scanner.close();
    }
}
