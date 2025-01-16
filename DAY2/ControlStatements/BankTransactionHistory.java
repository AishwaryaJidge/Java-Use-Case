import java.util.Scanner;

public class BankTransactionHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;

    
        String userChoice;
        do {
            System.out.println("\nBank Transaction Menu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Quit");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Deposited $" + depositAmount + ". New balance: $" + balance);
                    } else {
                        System.out.println("Invalid deposit amount. Please enter a positive value.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("Withdrew $" + withdrawAmount + ". New balance: $" + balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds! Your current balance is: $" + balance);
                    } else {
                        System.out.println("Invalid withdraw amount. Please enter a positive value.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the bank. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option (1-3).");
            }

            if (choice != 3) {
                System.out.print("\nWould you like to make another transaction? (yes/no): ");
                userChoice = scanner.next();
            } else {
                userChoice = "no"; 
            }

        } while (userChoice.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
