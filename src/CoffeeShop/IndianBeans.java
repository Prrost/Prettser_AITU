package CoffeeShop;

// Class representing Indian Beans, implementing the Beans interface and Cloneable
public class IndianBeans implements Beans, Cloneable {

    // Method to get the type of beans
    public String getBeansType() {
        return "Indian beans"; // Return the type of beans
    }

    // Method to clone the IndianBeans object
    public IndianBeans clone() {
        try {
            return (IndianBeans) super.clone();  // Cloning using shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();  // Print stack trace if cloning fails
            return null;  // Return null if cloning is not successful
        }
    }
}