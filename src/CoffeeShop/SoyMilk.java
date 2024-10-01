package CoffeeShop;

// Class representing Soy Milk, implementing the Milk interface and Cloneable
public class SoyMilk implements Milk, Cloneable {

    // Method to get the type of milk
    public String getMilkType() {
        return "Soy Milk"; // Return the type of milk
    }

    // Method to clone the SoyMilk object
    public SoyMilk clone() {
        try {
            return (SoyMilk) super.clone();  // Cloning using shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();  // Print stack trace if cloning fails
            return null; // Return null if cloning is not successful
        }
    }
}