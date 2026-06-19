public class UpiProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Processing UPI payment: " + amount);
    }
}