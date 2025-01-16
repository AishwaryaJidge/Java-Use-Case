import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Customer {
    private int customerId;
    private String name;
    private String address;
    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
class Order {
    private int orderId;
    private Date orderDate;
    private List<String> orderedItems;
    public Order(int orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderedItems = new ArrayList<>();
    }
    public void addItem(String item) {
        orderedItems.add(item);
    }
    public int getOrderId() {
        return orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public List<String> getOrderedItems() {
        return orderedItems;
    }
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Ordered Items: " + orderedItems);
    }
}
public class ECommerceOrderSystem {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "John Doe", "123 Elm Street");
        System.out.println("Customer Details:");
        customer.displayCustomerDetails();
        Order order = new Order(1001, new Date());
        order.addItem("Laptop");
        order.addItem("Smartphone");
        order.addItem("Headphones");
        System.out.println("\nOrder Details:");
        order.displayOrderDetails();
    }
}
