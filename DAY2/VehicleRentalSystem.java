
class Vehicle {
    String vehicleType;
    String numberPlate;
    double rentalPricePerDay;
    public Vehicle(String vehicleType, String numberPlate, double rentalPricePerDay) {
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    public double calculateRentalCost(int numberOfDays) {
        return rentalPricePerDay * numberOfDays;
    }
    public void displayDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Number Plate: " + numberPlate);
        System.out.println("Rental Price Per Day: $" + rentalPricePerDay);
    }
}
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String numberPlate, double rentalPricePerDay, int numberOfDoors) {
        super("Car", numberPlate, rentalPricePerDay);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
class Bike extends Vehicle {
    boolean hasSidecar;

    public Bike(String numberPlate, double rentalPricePerDay, boolean hasSidecar) {
        super("Bike", numberPlate, rentalPricePerDay);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}
class Truck extends Vehicle {
    double loadCapacity;

    public Truck(String numberPlate, double rentalPricePerDay, double loadCapacity) {
        super("Truck", numberPlate, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
public class VehicleRentalSystem {

    public static void main(String[] args) {
        Vehicle car = new Car("ABC123", 50.0, 4);
        Vehicle bike = new Bike("XYZ456", 20.0, true);
        Vehicle truck = new Truck("LMN789", 80.0, 10.0);
        int numberOfDays = 5;

        System.out.println("Rental details for car:");
        car.displayDetails();
        System.out.println("Total Rental Cost for " + numberOfDays + " days: $" + car.calculateRentalCost(numberOfDays));
        System.out.println();

        System.out.println("Rental details for bike:");
        bike.displayDetails();
        System.out.println("Total Rental Cost for " + numberOfDays + " days: $" + bike.calculateRentalCost(numberOfDays));
        System.out.println();

        System.out.println("Rental details for truck:");
        truck.displayDetails();
        System.out.println("Total Rental Cost for " + numberOfDays + " days: $" + truck.calculateRentalCost(numberOfDays));
    }
}
