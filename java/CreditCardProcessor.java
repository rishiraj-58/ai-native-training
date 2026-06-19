public class CreditCardProcessor implements PaymentProcessor {

    public void pay(double amount) {
        System.out.println("Processing credit card payment: " + amount);
    }
}