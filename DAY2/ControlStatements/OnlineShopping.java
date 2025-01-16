import java.util.Scanner;

public class ShoppingCartDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total price of items in the cart: $");
        double totalPrice = scanner.nextDouble();
        double finalPrice;
        if (totalPrice > 500) {
            finalPrice = totalPrice - (totalPrice * 0.10);
            System.out.println("You get a 10% discount!");
        } else if (totalPrice >= 200) {
            finalPrice = totalPrice - (totalPrice * 0.05);
            System.out.println("You get a 5% discount!");
        } else {
            finalPrice = totalPrice;
            System.out.println("No discount applied.");
        }
        System.out.println("The final price is: $" + finalPrice);
        scanner.close();
    }
}
