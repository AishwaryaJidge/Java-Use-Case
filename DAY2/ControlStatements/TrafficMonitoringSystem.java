import java.util.Scanner;

public class TrafficMonitoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalIntervals = 12;
        int[] vehiclesPerInterval = new int[totalIntervals];
        int totalVehicles = 0;

        System.out.println("Traffic Monitoring System");
        System.out.println("Record the number of vehicles passing every 5 minutes.\n");
        for (int i = 0; i < totalIntervals; i++) {
            System.out.print("Enter the number of vehicles for interval " + (i + 1) + " (5 minutes): ");
            vehiclesPerInterval[i] = scanner.nextInt();

           
            totalVehicles += vehiclesPerInterval[i];
        }

        
        double averageVehicles = (double) totalVehicles / totalIntervals;


        System.out.println("\nTraffic Monitoring Summary:");
        System.out.println("Total vehicles recorded: " + totalVehicles);
        System.out.printf("Average vehicles per 5-minute interval: %.2f\n", averageVehicles);

        scanner.close();
    }
}
