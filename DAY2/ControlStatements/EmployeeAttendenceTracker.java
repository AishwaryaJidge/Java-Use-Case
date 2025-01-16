import java.util.Scanner;

public class EmployeeAttendanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); 
        String[][] attendance = new String[7][numEmployees];
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter attendance for Employee " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Day " + (j + 1) + " (Present/Absent): ");
                attendance[j][i] = scanner.nextLine();
            }
        }
        System.out.println("\nEmployee Attendance for the Week:");
        System.out.println("Day\tEmployee 1\tEmployee 2\tEmployee 3\t..."); 
        for (int j = 0; j < 7; j++) {
            System.out.print("Day " + (j + 1) + "\t");
            for (int i = 0; i < numEmployees; i++) {
                System.out.print(attendance[j][i] + "\t\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
