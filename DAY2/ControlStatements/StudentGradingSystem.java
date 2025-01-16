import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double totalGrade = 0.0;
        for (int i = 1; i <= numStudents; i++) {
            System.out.println("\n--- Student " + i + " ---");
            System.out.print("Enter grade for student " + i + ": ");
            double grade = scanner.nextDouble();
            totalGrade += grade;
            if (grade < 40) {
                System.out.println("Student " + i + " has failed.");
            }
        }
        double averageGrade = totalGrade / numStudents;
        System.out.println("\nAverage grade for the class: " + averageGrade);
        scanner.close();
    }
}
