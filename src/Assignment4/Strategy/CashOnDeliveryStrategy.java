package Assignment4.Strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    public double calculateFinalPrice(double amount) {
        return amount + 300;
    }
}
