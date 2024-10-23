// PaymentStrategy interface (Strategy)
interface PaymentStrategy {
    void pay();
}

// Concrete strategies for different payment methods
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Processing credit card payment...");
    }
}

class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Processing PayPal payment...");
    }
}

class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Processing Bitcoin payment...");
    }
}

// Context class (ShoppingCart)
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Set the payment method dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        paymentStrategy.pay();
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay with credit card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout();  // Processing credit card payment...

        // Pay with PayPal
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout();  // Processing PayPal payment...

        // Pay with Bitcoin
        cart.setPaymentStrategy(new BitcoinPayment());
        cart.checkout();  // Processing Bitcoin payment...
    }
}
