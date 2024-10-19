package Assignment4.Strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    public double calculateFinalPrice(double amount) {
        return amount;
    }
}
