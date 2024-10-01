package CoffeeShop;

// Class representing a custom coffee, implementing Cloneable interface
public class CustomCoffee implements Cloneable {

    private String coffeeType; // Type of the coffee
    private Milk milk;         // Milk ingredient
    private Syrup syrup;       // Syrup ingredient
    private Beans beans;       // Beans ingredient

    // Constructor to initialize a CustomCoffee object
    public CustomCoffee(String coffeeType, Milk milk, Syrup syrup, Beans beans) {
        this.coffeeType = coffeeType; // Set the type of coffee
        this.milk = milk;             // Set the milk ingredient
        this.syrup = syrup;           // Set the syrup ingredient
        this.beans = beans;           // Set the beans ingredient
    }

    // Method to prepare the coffee, printing the ingredients used
    public void prepare() {
        System.out.println("Preparing " + coffeeType + " with:");
        if (milk != null) {
            System.out.println(" - " + milk.getMilkType() + " milk"); // Print milk type if it exists
        }
        if (syrup != null) {
            System.out.println(" - " + syrup.getSyrupType() + " syrup"); // Print syrup type if it exists
        }
        if (beans != null) {
            System.out.println(" - " + beans.getBeansType() + " beans"); // Print beans type if it exists
        }
    }

    // Method to clone the CustomCoffee object
    public CustomCoffee clone() {
        try {
            // Shallow copy of the CustomCoffee object
            CustomCoffee cloned = (CustomCoffee) super.clone();

            // Deep copy of the ingredients
            cloned.milk = (milk != null) ? milk.clone() : null;   // Clone milk if it exists
            cloned.syrup = (syrup != null) ? syrup.clone() : null; // Clone syrup if it exists
            cloned.beans = (beans != null) ? beans.clone() : null; // Clone beans if it exists

            return cloned; // Return the cloned CustomCoffee object
        } catch (CloneNotSupportedException e) {
            e.printStackTrace(); // Print stack trace if cloning fails
            return null; // Return null if cloning is not successful
        }
    }
}