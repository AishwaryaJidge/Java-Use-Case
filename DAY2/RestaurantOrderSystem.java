import java.util.ArrayList;
import java.util.Scanner;
class MenuItem {
    private String itemName;
    private double itemPrice;
    private String itemCategory;
    public MenuItem(String itemName, double itemPrice, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
    }
    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getItemCategory() {
        return itemCategory;
    }
    @Override
    public String toString() {
        return itemName + " (" + itemCategory + ") - $" + itemPrice;
    }
}
class Restaurant {
    private ArrayList<MenuItem> menu;
    private ArrayList<MenuItem> customerOrder;
    public Restaurant() {
        menu = new ArrayList<>();
        customerOrder = new ArrayList<>();
    }
    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }
    public void displayMenu() {
        System.out.println("\n--- Menu ---");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i));
        }
    }
    public void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Enter the item number to order (0 to finish): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            } else if (choice > 0 && choice <= menu.size()) {
                MenuItem orderedItem = menu.get(choice - 1);
                customerOrder.add(orderedItem);
                System.out.println("Added to order: " + orderedItem.getItemName());
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public void displayBill() {
        if (customerOrder.isEmpty()) {
            System.out.println("No items ordered.");
            return;
        }

        System.out.println("\n--- Your Bill ---");
        double total = 0;
        for (MenuItem item : customerOrder) {
            System.out.println(item.getItemName() + " - $" + item.getItemPrice());
            total += item.getItemPrice();
        }
        System.out.println("Total: $" + total);
    }
}
public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(new MenuItem("Burger", 8.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Pizza", 12.49, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Pasta", 10.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Coke", 2.49, "Beverage"));
        restaurant.addMenuItem(new MenuItem("Ice Cream", 4.99, "Dessert"));
        restaurant.takeOrder();
        restaurant.displayBill();
    }
}
