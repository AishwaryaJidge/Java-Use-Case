import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= numCustomers; i++) {
            System.out.println("\n--- Customer " + i + " ---");
            double totalBill = 0.0;
            String item;
            while (true) {
                System.out.print("Enter item name (or type 'done' to finish): ");
                item = scanner.nextLine();

                if (item.equalsIgnoreCase("done")) {
                    break;
                }

                System.out.print("Enter the price of " + item + ": $");
                double price = scanner.nextDouble();
                scanner.nextLine();

                totalBill += price;
            }
            System.out.println("\nTotal bill for Customer " + i + ": $" + totalBill);
        }
        scanner.close();
    }
}
