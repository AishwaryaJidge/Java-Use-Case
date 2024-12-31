import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);
        scanner.close();
    }
}
