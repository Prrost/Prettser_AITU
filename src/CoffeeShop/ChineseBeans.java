package CoffeeShop;

// Class representing Chinese Beans, implementing the Beans interface and Cloneable
public class ChineseBeans implements Beans, Cloneable {

    // Method to get the type of beans
    public String getBeansType() {
        return "Chinese Beans";
    }

    // Method to clone the ChineseBeans object
    public ChineseBeans clone() {
        try {
            return (ChineseBeans) super.clone();  // Cloning using shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();  // Print stack trace if cloning fails
            return null;  // Return null if cloning is not successful
        }
    }
}