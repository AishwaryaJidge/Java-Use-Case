import java.util.Scanner;

public class BankATMSimulation {
    public static void main(String[] args) {
        double balance = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank ATM!");
        boolean running = true;
        while (running) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Successfully deposited $" + depositAmount + ". New balance: $" + balance);
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdrew $" + withdrawAmount + ". New balance: $" + balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance! Your current balance is: $" + balance);
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
