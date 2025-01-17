import java.util.Random;

public class SensorDataMonitoring {
    public static void main(String[] args) {
        Random random = new Random();
        int threshold = 90;
        int readingsCount = 0;
        int highestValue = Integer.MIN_VALUE;

        System.out.println("Starting sensor data monitoring...");

        while (true) {
            int sensorValue = random.nextInt(100) + 1;

            readingsCount++;
            System.out.println("Reading " + readingsCount + ": " + sensorValue);
            if (sensorValue > highestValue) {
                highestValue = sensorValue;
            }
            if (sensorValue > threshold) {
                System.out.println("\nThreshold exceeded! Sensor value: " + sensorValue);
                break;
            }
        }
        System.out.println("\nMonitoring Stopped.");
        System.out.println("Total readings taken: " + readingsCount);
        System.out.println("Highest sensor value recorded: " + highestValue);
    }
}
