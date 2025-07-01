
// Class 1: Abstract blueprint for payments
abstract class Payment {
    // Abstract method: Subclasses must implement this
    abstract void process(double amount);

    // Regular method: Common functionality for all payment types
    void paymentDetails() {
        System.out.println("Processing payment securely...");
    }
}
class CreditCardPayment extends Payment {
    @Override
    void process(double amount) {
        paymentDetails();  // Reuse common logic
        System.out.println("Processing credit card payment of $" + amount);
    }
}
class PayPalPayment extends Payment {
    @Override
    void process(double amount) {
        paymentDetails();  // Reuse common logic
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
class PaymentService {
    private Payment payment; // Holds a reference to the abstract Payment class
    PaymentService(Payment payment) {
        this.payment = payment; // User specifies the payment type
    }
    void makePayment(double amount) {
        payment.process(amount); // Delegates processing to the specific payment type
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentService service;
        // Using Credit Card payment
        service = new PaymentService(new CreditCardPayment());
        service.makePayment(150.75);
        // Switching to PayPal payment
        service = new PaymentService(new PayPalPayment());
        service.makePayment(200.50);
    }
}