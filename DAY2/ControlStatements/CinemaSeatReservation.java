import java.util.Scanner;

public class CinemaSeatReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 5;
        int cols = 5;
        char[][] seats = new char[rows][cols];

       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 'A'; 
            }
        }

        String continueBooking;
        do {
            System.out.println("\nCurrent Seat Layout:");
            displaySeats(seats);

            System.out.print("\nEnter the row number (1-" + rows + "): ");
            int row = scanner.nextInt() - 1;

            System.out.print("Enter the seat number (1-" + cols + "): ");
            int col = scanner.nextInt() - 1;

            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                if (seats[row][col] == 'A') {
                    seats[row][col] = 'R'; 
                    System.out.println("Seat successfully reserved.");
                } else {
                    System.out.println("Seat is already reserved. Please choose a different seat.");
                }
            } else {
                System.out.println("Invalid seat selection. Please try again.");
            }

            System.out.print("\nDo you want to reserve another seat? (yes/no): ");
            scanner.nextLine(); 
            continueBooking = scanner.nextLine();
        } while (continueBooking.equalsIgnoreCase("yes"));

        System.out.println("\nFinal Seat Layout:");
        displaySeats(seats);
        System.out.println("Thank you for using the Cinema Seat Reservation System!");
        scanner.close();
    }

   
    public static void displaySeats(char[][] seats) {
        System.out.print("  ");
        for (int col = 1; col <= seats[0].length; col++) {
            System.out.print(col + " ");
        }
        System.out.println();

        for (int i = 0; i < seats.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}
