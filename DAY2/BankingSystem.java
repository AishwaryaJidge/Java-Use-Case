
class BankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double minimumBalance;
    public SavingsAccount(String accountHolderName, String accountNumber, double balance, double minimumBalance) {
        super(accountHolderName, accountNumber, balance);
        this.minimumBalance = minimumBalance;
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or you must maintain a minimum balance of $" + minimumBalance);
        }
    }
    @Override
    public void checkBalance() {
        System.out.println("Current Balance (Savings Account): $" + balance);
        System.out.println("Minimum Balance Requirement: $" + minimumBalance);
    }
}
class CurrentAccount extends BankAccount {
    double overdraftLimit;
    public CurrentAccount(String accountHolderName, String accountNumber, double balance, double overdraftLimit) {
        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit of $" + overdraftLimit);
        }
    }
    @Override
    public void checkBalance() {
        System.out.println("Current Balance (Current Account): $" + balance);
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("John Doe", "SA123", 1000.0, 200.0);
        BankAccount currentAccount = new CurrentAccount("Jane Smith", "CA456", 500.0, 300.0);

        System.out.println("Operations on Savings Account:");
        savingsAccount.checkBalance();
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.checkBalance();
        savingsAccount.withdraw(1300);
        savingsAccount.checkBalance();
        System.out.println();

        System.out.println("Operations on Current Account:");
        currentAccount.checkBalance();
        currentAccount.deposit(200);
        currentAccount.withdraw(600);
        currentAccount.checkBalance();
        currentAccount.withdraw(200);
        currentAccount.checkBalance();
    }
}
