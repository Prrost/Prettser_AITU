package assignment3.chain;

public class PaymentC extends PaymentHandler {
    private int sum;

    public PaymentC(int sum) {
        this.sum = sum;
    }


    public void handle(int amount){
        if(amount > sum){
            System.out.println("Can't pay. Don't have enough money on this payment.(PaymentC)");
            if (next != null){
                next.handle(amount);
            }else {
                System.out.println("Can't pay. Don't have enough money on any of payments.");
            }
        }else {
            sum -= amount;
            System.out.println("Payment completed. You have " + sum + " dollars.(PaymentB)");
        }
    }
}

