import java.util.Scanner;

public class ParkingLotFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of vehicles: ");
        int numVehicles = scanner.nextInt();
        for (int i = 1; i <= numVehicles; i++) {
            System.out.println("\nVehicle " + i + ":");
            System.out.print("Enter the hours parked: ");
            int hoursParked = scanner.nextInt();

            int fee;
            if (hoursParked <= 5) {
                fee = hoursParked * 2;
            } else {
                fee = (5 * 2) + ((hoursParked - 5) * 1);
            }
            System.out.println("Parking fee: $" + fee);
        }

        scanner.close();
    }
}
