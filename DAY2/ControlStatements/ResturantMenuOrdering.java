import java.util.Scanner;

public class RestaurantMenuOrdering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menuItems = {
            "1. Burger - $5.99",
            "2. Pizza - $8.99",
            "3. Pasta - $7.49",
            "4. Salad - $4.49",
            "5. Drink - $1.99"
        };
        double[] prices = {5.99, 8.99, 7.49, 4.49, 1.99};

        double totalCost = 0.0;  
        StringBuilder order = new StringBuilder("Your Order:\n");  

      
        System.out.println("Welcome to the Restaurant! Here is the menu:");
        for (String item : menuItems) {
            System.out.println(item);
        }

     
        while (true) {
            System.out.print("\nEnter the item number to order (1-5), or type 'done' to finish: ");
            String choice = scanner.nextLine();

            
            if (choice.equalsIgnoreCase("done")) {
                break;
            }

           
            try {
                int itemNumber = Integer.parseInt(choice);

                if (itemNumber >= 1 && itemNumber <= 5) {
                  
                    order.append(menuItems[itemNumber - 1]).append("\n");
                    totalCost += prices[itemNumber - 1];
                } else {
                    System.out.println("Invalid item number. Please select a number between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid item number.");
            }
        }

       
        System.out.println("\n--- Complete Order ---");
        System.out.println(order);
        System.out.println("Total cost: $" + totalCost);

        scanner.close();
    }
}
