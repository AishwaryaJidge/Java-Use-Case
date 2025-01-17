import java.util.Scanner;

public class DailyStepTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] stepsPerDay = new int[7];
        int totalSteps = 0;

        System.out.println("Daily Step Tracker\n");

      
        for (int i = 0; i < daysOfWeek.length; i++) {
            System.out.print("Enter the steps taken on " + daysOfWeek[i] + ": ");
            stepsPerDay[i] = scanner.nextInt();

            totalSteps += stepsPerDay[i];
        }

      
        double averageSteps = (double) totalSteps / daysOfWeek.length;

   
        System.out.println("\nWeekly Step Summary:");
        System.out.println("Total steps taken: " + totalSteps);
        System.out.printf("Average steps per day: %.2f\n", averageSteps);

        scanner.close();
    }
}
