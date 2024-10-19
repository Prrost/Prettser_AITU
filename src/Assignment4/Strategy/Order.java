package Assignment4.Strategy;

public class Order {
    private PaymentStrategy paymentStrategy;
    private double price;

    public Order(PaymentStrategy paymentStrategy, double price) {
        this.paymentStrategy = paymentStrategy;
        this.price = price;
    }

    public double calculateFinalPrice(){
        return paymentStrategy.calculateFinalPrice(price);
    }

}
