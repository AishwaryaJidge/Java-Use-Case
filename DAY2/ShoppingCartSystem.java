import java.util.ArrayList;
import java.util.Scanner;
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
class Cart {
    private ArrayList<Product> products;
    public Cart() {
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(product.getName())) {
                p.setQuantity(p.getQuantity() + product.getQuantity());
                System.out.println("Updated quantity for product: " + product.getName());
                return;
            }
        }
        products.add(product);
        System.out.println("Added product: " + product.getName());
    }
    public void removeProduct(String productName) {
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(productName)) {
                products.remove(p);
                System.out.println("Removed product: " + productName);
                return;
            }
        }
        System.out.println("Product not found in the cart: " + productName);
    }
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;
    }
    public void displayCart() {
        if (products.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("Products in your cart:");
        for (Product p : products) {
            System.out.println(p.getName() + " - $" + p.getPrice() + " x " + p.getQuantity());
        }
    }
}

// Main class
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add product");
            System.out.println("2. Remove product");
            System.out.println("3. View cart");
            System.out.println("4. Calculate total");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addProduct(new Product(name, price, quantity));
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String removeName = scanner.next();
                    cart.removeProduct(removeName);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.println("Total price: $" + cart.calculateTotal());
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for shopping!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
