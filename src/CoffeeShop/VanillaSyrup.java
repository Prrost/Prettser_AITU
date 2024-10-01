package CoffeeShop;

// Class representing Vanilla Syrup, implementing the Syrup interface and Cloneable
public class VanillaSyrup implements Syrup, Cloneable {

    // Method to get the type of syrup
    public String getSyrupType() {
        return "Vanilla Syrup"; // Return the type of syrup
    }

    // Method to clone the VanillaSyrup object
    public VanillaSyrup clone() {
        try {
            return (VanillaSyrup) super.clone();  // Cloning using shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();  // Print stack trace if cloning fails
            return null; // Return null if cloning is not successful
        }
    }
}