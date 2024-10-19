package Assignment4.Strategy;



public class CardPaymentStrategy implements PaymentStrategy {
    public double calculateFinalPrice(double orderPrice){
        return orderPrice * 1.02;
    }
}
