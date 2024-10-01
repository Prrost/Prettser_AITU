package CoffeeShop;

// Interface representing coffee beans
public interface Beans {
    // Method to get the type of beans
    String getBeansType();

    // Method to clone the Beans object
    Beans clone();
}