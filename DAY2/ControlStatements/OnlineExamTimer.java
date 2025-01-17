import java.util.Scanner;

public class OnlineExamTimer {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total exam time in minutes: ");
        int totalMinutes = scanner.nextInt();

        System.out.println("\nExam timer started. Good luck!\n");
        int remainingTime = totalMinutes;

        while (remainingTime > 0) {
            System.out.println("Time remaining: " + remainingTime + " minute(s)");
            Thread.sleep(1000);

            remainingTime--;
        }

        System.out.println("\nTime's up! Please submit your exam.");
        scanner.close();
    }
}
