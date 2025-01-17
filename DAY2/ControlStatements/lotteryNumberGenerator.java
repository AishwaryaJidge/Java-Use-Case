import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class LotteryNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of lottery numbers to generate: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The number of lottery numbers must be greater than 0.");
            return;
        }

        HashSet<Integer> lotteryNumbers = new HashSet<>();
        Random random = new Random();
        while (lotteryNumbers.size() < n) {
            int number = random.nextInt(100) + 1;
            lotteryNumbers.add(number);
        }

        System.out.println("Generated Lottery Numbers:");
        for (int number : lotteryNumbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
