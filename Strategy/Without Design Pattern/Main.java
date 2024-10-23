/*
 * Imagine you’re building a shopping cart system.
 * Customers can choose different payment methods: Credit Card, PayPal, or Bitcoin.
 * Without the Strategy pattern, you might end up using if-else statements to handle,
 * different payment methods, which can make the code harder to maintain,
 * as more payment options are added.
 */

 class ShoppingCart {
    public void checkout(String paymentMethod) {
        if (paymentMethod.equals("credit")) {
            System.out.println("Processing credit card payment...");
        } else if (paymentMethod.equals("paypal")) {
            System.out.println("Processing PayPal payment...");
        } else if (paymentMethod.equals("bitcoin")) {
            System.out.println("Processing Bitcoin payment...");
        }
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.checkout("credit");   // Processing credit card payment...
        cart.checkout("paypal");   // Processing PayPal payment...
    }
}

