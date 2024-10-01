package CoffeeShop;

// Singleton class representing a Coffee Shop
public class CoffeeShop {
    private static CoffeeShop instance; // Static field to hold the single instance of CoffeeShop

    // Private constructor to prevent instantiation from outside the class
    private CoffeeShop() {
        System.out.println("CoffeeShop created"); // Print message when CoffeeShop is created
    }

    // Static method to get the single instance of CoffeeShop
    public static CoffeeShop getInstance() {
        if (instance == null) { // Check if the instance is not already created
            instance = new CoffeeShop(); // Create a new instance if it doesn't exist
        }
        return instance; // Return the single instance of CoffeeShop
    }
}