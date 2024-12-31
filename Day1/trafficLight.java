import java.util.Scanner;

public class TrafficLightSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the traffic light color (Green, Yellow, Red): ");
        String lightColor = scanner.nextLine().trim().toLowerCase();
        System.out.print("Is there an obstacle? (yes/no): ");
        String obstacleResponse = scanner.nextLine().trim().toLowerCase();
        boolean isObstacle = obstacleResponse.equals("yes");
        if (isObstacle) {
            System.out.println("There is an obstacle. You cannot move.");
        } else {
                       switch (lightColor) {
                case "green":
                    System.out.println("Green means 'Go'. You can move.");
                    break;
                case "yellow":
                    System.out.println("Yellow means 'Slow Down'. Proceed with caution.");
                    break;
                case "red":
                    System.out.println("Red means 'Stop'. You must stop.");
                    break;
                default:
                    System.out.println("Invalid traffic light color. Please enter Green, Yellow, or Red.");
                    break;
            }
        }
        scanner.close();
    }
}
