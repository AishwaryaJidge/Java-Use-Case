import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the interest rate (in percentage): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is: " + simpleInterest);
        scanner.close();
    }
}
