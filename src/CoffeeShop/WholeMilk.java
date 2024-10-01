package CoffeeShop;

// Class representing Whole Milk, implementing the Milk interface and Cloneable
public class WholeMilk implements Milk, Cloneable {

    // Method to get the type of milk
    public String getMilkType() {
        return "Whole Milk"; // Return the type of milk
    }

    // Method to clone the WholeMilk object
    public WholeMilk clone() {
        try {
            return (WholeMilk) super.clone();  // Cloning using shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();  // Print stack trace if cloning fails
            return null; // Return null if cloning is not successful
        }
    }
}