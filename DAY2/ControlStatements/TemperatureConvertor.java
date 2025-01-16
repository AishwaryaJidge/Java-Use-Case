import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the conversion direction:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit - 32) * 5/9;
                System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
                break;

            default:
                System.out.println("Invalid choice! Please select 1 or 2.");
        }
        scanner.close();
    }
}
