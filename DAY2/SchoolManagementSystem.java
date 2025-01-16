import java.util.ArrayList;
import java.util.Scanner;
class Student {
    private String name;
    private int rollNumber;
    private ArrayList<Integer> grades;
    private int attendance;
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new ArrayList<>();
        this.attendance = 0;
    }
    public void addGrade(int grade) {
        grades.add(grade);
    }
    public void markAttendance() {
        attendance++;
    }
    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.size();
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Attendance: " + attendance);
        System.out.println("Grades: " + grades);
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
    public int getRollNumber() {
        return rollNumber;
    }
}
public class SchoolManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Welcome to the School Management System!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's name: ");
                String name = scanner.next();
                System.out.print("Enter roll number: ");
                int rollNumber = scanner.nextInt();
                Student student = new Student(name, rollNumber);
                students.add(student);
                System.out.println("Student added successfully!");

            } else if (choice == 2) {
                for (Student student : students) {
                    student.displayDetails();
                }

            } else if (choice == 3) {
                System.out.println("Exiting the system...");
                break;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
